package com.starwars.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.starwars.AppConstants;
import com.starwars.domain.Film;
import com.starwars.domain.Person;
import com.starwars.domain.Planet;
import com.starwars.domain.PlanetsResponse;
import com.starwars.domain.PopulationCountRespone;
import com.starwars.domain.Specie;
import com.starwars.domain.Starship;

@Service
public class StarWarsService {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${starwars.api.url}")
	private String starWarsApiUrl;

	public List<Starship> fetchStarshipsInfo(String personId) {
		Person person = restTemplate.getForObject(starWarsApiUrl + AppConstants.PEOPLE_URL + personId, Person.class);
		List<Starship> starships = new ArrayList<>();
		for (String starshipUrl : person.getStarships()) {
			starships.add(restTemplate.getForObject(starshipUrl, Starship.class));
		}
		return starships;
	}

	public Set<String> fetchSpeciesClassifications(String filmId) {
		Film film = restTemplate.getForObject(starWarsApiUrl + AppConstants.FILMS_URL + filmId, Film.class);
		Set<String> classifications = new HashSet<>();
		for (String specieUrl : film.getSpecies()) {
			Specie specie = restTemplate.getForObject(specieUrl, Specie.class);
			if (specie != null) {
				classifications.add(specie.getClassification());
			}
		}
		return classifications;
	}

	public PopulationCountRespone fetchPoupationCountOfAllPlanets() {
		PopulationCountRespone response = new PopulationCountRespone();
		BigInteger count = new BigInteger("0");
		int pageNo = 1;
		while (true) {
			PlanetsResponse planetsResponse = restTemplate.getForObject(starWarsApiUrl + AppConstants.PLANETS_URL
					+ AppConstants.PAGE_NUMBER_URL + pageNo,
					PlanetsResponse.class);
			for(Planet planet:planetsResponse.getResults()) {
				if(planet.getPopulation().chars().allMatch(Character::isDigit))
					count = count.add(new BigInteger(planet.getPopulation()));
			}
			if(planetsResponse.getNext() == null)
				break;
			pageNo++;
		}
		response.setPopulationCount(count);
		return response;
	}

}
