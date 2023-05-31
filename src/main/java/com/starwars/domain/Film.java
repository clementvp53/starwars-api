package com.starwars.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Film {
	@JsonProperty("characters")
	List<String> characters;
	@JsonProperty("created")
	String created;
	@JsonProperty("director")
	String director;
	@JsonProperty("edited")
	String edited;
	@JsonProperty("episode_id")
	int episode_id;
	@JsonProperty("opening_crawl")
	String openingCrawl;
	@JsonProperty("planets")
	List<String> planets;
	@JsonProperty("producer")
	String producer;
	@JsonProperty("release_date")
	String release_date;
	@JsonProperty("species")
	List<String> species;
	@JsonProperty("starships")
	List<String> starships;
	@JsonProperty("title")
	String title;
	@JsonProperty("url")
	String url;
	@JsonProperty("vehicles")
	List<String> vehicles;
}
