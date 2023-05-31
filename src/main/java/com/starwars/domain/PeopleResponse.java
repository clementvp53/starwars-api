package com.starwars.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PeopleResponse {
	@JsonProperty("count")
	int count;
	@JsonProperty("next")
	String next;
	@JsonProperty("previous")
	String previous;	
	@JsonProperty("results")
	List<Person> results;
}
