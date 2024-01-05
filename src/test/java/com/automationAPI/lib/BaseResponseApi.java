package com.automationAPI.lib;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class BaseResponseApi {
    String peoplePath = "/people/2/";
    public static final String API_PATH = System.getProperty("url");

    public String returnPeoplepath(){
        return API_PATH + peoplePath;
    }

    public String returnFilm(String films){
        Response peopleResponse = given().when().get(returnPeoplepath());
        return peopleResponse.path(films);
    }

    public String returnPlanet(String planet, String film){
        Response responsePeople = given().when().get(returnFilm(film));
        return responsePeople.path(planet);
    }
}
