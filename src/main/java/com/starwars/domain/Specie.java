package com.starwars.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Specie {
	@JsonProperty("average_height")
	String averageHeight;
	@JsonProperty("average_lifespan")
	String averageLifespan;
	@JsonProperty("classification")
	String classification;
	@JsonProperty("created")
	String created;
	@JsonProperty("designation")
	String designation;
	@JsonProperty("edited")
	String edited;
	@JsonProperty("eye_colors")
	String eyeColors;
	@JsonProperty("hair_colors")
	String hairColors;
	@JsonProperty("homeworld")
	String homeworld;
	@JsonProperty("language")
	String language;
	@JsonProperty("name")
	String name;
	@JsonProperty("people")
	List<String> people;
	@JsonProperty("films")
	List<String> films;
	@JsonProperty("skin_colors")
	String skinColors;
	@JsonProperty("url")
	String url;
}
