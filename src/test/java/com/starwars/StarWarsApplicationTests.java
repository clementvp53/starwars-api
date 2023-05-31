package com.starwars;

import static io.restassured.RestAssured.get;
import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigInteger;

import javax.annotation.PostConstruct;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class StarWarsApplicationTests {

	@LocalServerPort
    private int port;

    private String uri;

    @PostConstruct
    public void init() {
        uri = "http://localhost:" + port;
    }
    
    @Test
    void contextLoads() {
    }
    
    @Test
    public void whenGetPersonStarship_thenOK(){
        get(uri + "/starwars/people/1/starships").then().assertThat().statusCode(200);
    }
    
    @Test
    public void whenGetInvalidPersonStarship_thenBadReqest(){
        get(uri + "/starwars/people/100/starships").then().assertThat().statusCode(400);
    }
    
    @Test
    public void whenGetClassificationOfSpeciesOfFilm_thenOK(){
        get(uri + "/starwars/films/1/species/classifications").then().assertThat().statusCode(200);
    }
    
    @Test
    public void whenGetClassificationOfSpeciesOfInvalidFilm_thenBadRequest(){
        get(uri + "/starwars/films/100/species/classifications").then().assertThat().statusCode(400);
    }
    
    @Test
    public void whenGetTotalPopulationCount_thenOK(){
        String populationiCount = get(uri + "/starwars/totalpopulation").then().assertThat().statusCode(200).extract()
        .path("populationCount").toString();        
        BigInteger expectedCount = new BigInteger("1711401432500");        
        assertThat(expectedCount.equals(new BigInteger(populationiCount)));
    }

}
