package com.starwars.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starwars.AppConstants;
import com.starwars.domain.PopulationCountRespone;
import com.starwars.domain.Starship;
import com.starwars.service.StarWarsService;

@RestController
@RequestMapping(AppConstants.STARWARS_URL)
public class StarWarsContoller {

	@Autowired
	private StarWarsService starWarsService;

	@Value("${starwars.api.url}")
	private String starWarsApiUrl;

	@GetMapping(value = AppConstants.PEOPLE_STARSHIP_URL)
	public ResponseEntity<List<Starship>> getPersonRelatedStarships(@PathVariable(AppConstants.ID) String userId) {
		return new ResponseEntity<>(starWarsService.fetchStarshipsInfo(userId), HttpStatus.OK);
	}

	@GetMapping(value = AppConstants.FILMS_SPECIES_CLASSIFICATIONS_URL)
	public ResponseEntity<Set<String>> getSpeciesClassfication(@PathVariable(AppConstants.ID) String filmId) {
		return new ResponseEntity<>(starWarsService.fetchSpeciesClassifications(filmId), HttpStatus.OK);
	}

	@GetMapping(value = AppConstants.POPULATION_COUNT_URL)
	public ResponseEntity<PopulationCountRespone> getTotalPopulation() {
		return new ResponseEntity<>(starWarsService.fetchPopulationCountOfAllPlanets(), HttpStatus.OK);
	}

}
