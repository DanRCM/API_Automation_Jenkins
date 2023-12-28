package com.automationAPI.ApiResponses;

import com.automationAPI.lib.BaseResponseApi;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class VerificationFilm extends BaseResponseApi {
    public void film(String film){
        Response response = given().get(API_PATH+ film);

        Assert.assertEquals(response.getStatusCode(),404);
        System.out.println("status code " + response.getStatusCode());
    }
}
