# Starwars-api

This is a spring boot application which communicates with star wars api which is
hosted on the site https://swapi.dev/api. It contains api's specific to films,
people, planets, species, starships, vehicles

This spring boot application has exposed three different API's which are going to
work on top of the starwars api's.

1) Fetches list of starships related to a speicific person.

	URI: /starwars/people/{id}/starships
	
	ex:  /starwars/people/1/starships -- fetchs starships information belongs to Luke Skywalker

2) Fetches classification of all species which belongs to specific episode.

	URI: /starwars/films/{id}/species/classifications
	
	ex:  /starwars/films/1/species/classifications -- fetchs episode 1 species classifications.
	
3) Fetches total population count of all the panets.

	URI: /starwars/totalpopulation
	
	ex:  /starwars/totalpopulation -- fetches total population count across all planets
	
Technologies Used:
-----------------
1) Java 11
2) Maven
2) Spring Boot 2.5.0
3) Lombok