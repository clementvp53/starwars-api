package com.starwars.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {
	@JsonProperty("name")
	String name;
	@JsonProperty("height")
	String height;
	@JsonProperty("mass")
	String mass;
	@JsonProperty("hair_color")
	String hairColor;
	@JsonProperty("skin_color")
	String skinColor;
	@JsonProperty("eye_color")
	String eyeColor;
	@JsonProperty("birth_year")
	String birthYear;
	@JsonProperty("gender")
	String gender;
	@JsonProperty("homeworld")
	String homeworld;

	@JsonProperty("films")
	List<String> films;
	@JsonProperty("species")
	List<String> species;
	@JsonProperty("vehicles")
	List<String> vehicles;
	@JsonProperty("starships")
	List<String> starships;
	@JsonProperty("created")
	String created;
	@JsonProperty("edited")
	String edited;
	@JsonProperty("url")
	String url;

}
