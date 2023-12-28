package com.automationAPI.lib;

import com.automationAPI.modelsAPIResponses.*;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class BaseTest {
    public DataFilms dataFilms = new DataFilms();
    public PeopleInformation peopleInformation = new PeopleInformation();
    public PlanetFilms planetFilms = new PlanetFilms();
    //put Url using returnPlanet() and the path for commpare
    public void compareResponse(String UrlPlanet, String path){
        Response response = given().when().get(UrlPlanet);

        System.out.println("UrlPlanet: " + UrlPlanet);
        System.out.println("Uri: " + response.path(path));

        Assert.assertEquals(response.path(path), UrlPlanet);
    }
    /* Example films/number/ */
    public void verificationFilmByPath(String film, int code){
        Response response = given().when().get(BaseResponseApi.API_PATH+ film);

        Assert.assertEquals(response.getStatusCode(),code);
        System.out.println("status code " + code);
    }
}
