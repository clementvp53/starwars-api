package com.starwars.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PlanetsResponse {
	@JsonProperty("count")
	int count;
	@JsonProperty("next")
	String next;
	@JsonProperty("previous")
	String previous;	
	@JsonProperty("results")
	List<Planet> results;
}
