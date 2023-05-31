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

import com.starwars.domain.PopulationCountRespone;
import com.starwars.domain.Starship;
import com.starwars.service.StarWarsService;

@RestController
@RequestMapping("/starwars")
public class StarWarsContoller {

	@Autowired
	private StarWarsService starWarsService;

	@Value("${starwars.api.url}")
	private String starWarsApiUrl;

	@GetMapping(value = "/people/{id}/starships")
	public ResponseEntity<List<Starship>> getPersonRelatedStarships(@PathVariable("id") String userId) {
		return new ResponseEntity<>(starWarsService.fetchStarshipsInfo(userId), HttpStatus.OK);
	}

	@GetMapping(value = "/films/{id}/species/classifications")
	public ResponseEntity<Set<String>> getSpeciesClassfication(@PathVariable("id") String filmId) {
		return new ResponseEntity<>(starWarsService.fetchSpeciesClassifications(filmId), HttpStatus.OK);
	}

	@GetMapping(value = "/totalpopulation")
	public ResponseEntity<PopulationCountRespone> getTotalPopulation() {
		return new ResponseEntity<>(starWarsService.fetchPoupationCountOfAllPlanets(), HttpStatus.OK);
	}

}
