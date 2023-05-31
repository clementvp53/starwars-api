package com.starwars.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Starship {
	@JsonProperty("MGLT")
	String mglt;
	@JsonProperty("cargo_capacity")
	String cargoCapacity;
	@JsonProperty("consumables")
	String consumables;
	@JsonProperty("cost_in_credits")
	String costInCredits;
	@JsonProperty("created")
	String created;
	@JsonProperty("crew")
	String crew;
	@JsonProperty("edited")
	String edited;
	@JsonProperty("hyperdrive_rating")
	String hyperdriveRating;
	@JsonProperty("length")
	String length;

	@JsonProperty("manufacturer")
	String manufacturer;
	@JsonProperty("max_atmosphering_speed")
	String maxAtmospheringSpeed;
	@JsonProperty("model")
	String model;
	@JsonProperty("name")
	String name;
	@JsonProperty("passengers")
	String passengers;
	@JsonProperty("films")
	List<String> films;
	@JsonProperty("pilots")
	List<String> pilots;
	@JsonProperty("starship_class")
	String starshipClass;
	@JsonProperty("url")
	String url;

}
