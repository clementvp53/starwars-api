package com.starwars.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Planet {
	@JsonProperty("name")
	String name;
	@JsonProperty("rotation_period")
	String rotationPeriod;
	@JsonProperty("orbital_period")
	String orbitalPeriod;
	@JsonProperty("diameter")
	String diameter;
	@JsonProperty("climate")
	String climate;
	@JsonProperty("gravity")
	String gravity;
	@JsonProperty("terrain")
	String terrain;
	@JsonProperty("surface_water")
	String surfaceWater;
	@JsonProperty("population")
	String population;
	@JsonProperty("residents")
	List<String> residents;
	@JsonProperty("films")
	List<String> films;
	@JsonProperty("created")
	String created;
	@JsonProperty("edited")
	String edited;
	@JsonProperty("url")
	String url;
}
