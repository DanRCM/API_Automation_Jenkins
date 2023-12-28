package com.automationAPI.ApiResponses;

import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class PlanetResponse extends PlanetFilms {
    public void comparateResponse(String UrlPlanet){
        Response response = given().get(UrlPlanet);

        System.out.println("UrlPlanet: " + UrlPlanet);
        System.out.println("Uri: " + response.path("url"));

        Assert.assertEquals(response.path("url"), UrlPlanet);
    }
}
