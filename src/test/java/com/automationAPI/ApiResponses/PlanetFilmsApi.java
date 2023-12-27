package com.automationAPI.ApiResponses;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class PlanetFilmsApi extends DataFilmsApi {
    public PlanetFilmsApi(String people) {
        super(people);
    }

    public String returnPlanet(String planet){
        Response responsePeople = given().get(returnFilm("films[5]"));
        return responsePeople.path(planet);
    }

    public void dataPlanet(String Urlplanet){
        String expectedGravity = "1 standard";
        String expectedTerrain = "desert";
        Response response = given().get(Urlplanet);
        Assert.assertEquals(response.getStatusCode(),200);
        System.out.println("Available status code");
        Assert.assertEquals(response.path("gravity"),expectedGravity);
        System.out.println("Available expected gravity");
        Assert.assertEquals(response.path("terrain"),expectedTerrain);
        System.out.println("Available expected terrain");
    }
}
