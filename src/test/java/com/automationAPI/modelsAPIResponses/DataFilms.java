package com.automationAPI.modelsAPIResponses;

import com.automationAPI.lib.BaseResponseApi;
import io.restassured.response.Response;
import org.testng.Assert;
import java.time.format.DateTimeFormatter;
import static io.restassured.RestAssured.given;

public class DataFilms extends BaseResponseApi {
    public void dateFormatTest(String filmUrl) {
        Response responseFilm = given().get(filmUrl);

        String expectedDateFormat = "yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'";
        String releaseDate = responseFilm.path("created");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(expectedDateFormat);
        try {
            Assert.assertEquals(responseFilm.getStatusCode(), 200);
            formatter.parse(releaseDate);

            System.out.println("Available date format");
        } catch (Exception e) {
            Assert.fail("It isn't available Date format" + e.getMessage());
        }
    }
    public void verifyDataInFilm(String filmUrl) {
        Response responseFilm = given().get(filmUrl);

        Assert.assertEquals(responseFilm.getStatusCode(), 200, "The request was not successful");
        System.out.println("Available status code");

        Assert.assertTrue(responseFilm.jsonPath().getList("characters").size() > 1);
        System.out.println("Number of characters greater than one");

        Assert.assertTrue(responseFilm.jsonPath().getList("planets").size()>1);
        System.out.println("Number of planets greater than one");

        Assert.assertTrue(responseFilm.jsonPath().getList("starships").size()>1);
        System.out.println("Number of starships greater than one");

        Assert.assertTrue(responseFilm.jsonPath().getList("vehicles").size()>1);
        System.out.println("Number of vehicles greater than one");

        Assert.assertTrue(responseFilm.jsonPath().getList("species").size()>1);
        System.out.println("Number of species greater than one");
    }
}
