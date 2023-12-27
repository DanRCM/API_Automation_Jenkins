package com.automationAPI.ApiResponses;

import io.restassured.response.Response;
import org.testng.Assert;
import static io.restassured.RestAssured.given;


public class PeopleApi{
    String people;
    public static final String API_PATH = "https://swapi.dev/api";

    public PeopleApi(String people) {
        this.people = people;
    }

    public String returnPeoplepath(){
        return API_PATH + people;
    }
    public void skin_colorTest(){
        Response response = given().get(returnPeoplepath());
        String skinColor = response.path("skin_color");
        Assert.assertEquals(response.getStatusCode(),200);
        System.out.println("Available response status code");
        Assert.assertEquals(skinColor, "gold");
        System.out.println("Skin color is gold");
    }
    public void filmsTest(){
        Response response = given().get(returnPeoplepath());
        int films = response.jsonPath().getList("films").size();
        Assert.assertEquals(response.getStatusCode(),200);
        System.out.println("Available response status code");
        Assert.assertEquals(films,6);
        System.out.println("Available number of films");
    }
}
