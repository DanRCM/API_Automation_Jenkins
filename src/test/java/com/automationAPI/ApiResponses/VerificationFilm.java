package com.automationAPI.ApiResponses;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class VerificationFilm extends DataFilmsApi{
    public VerificationFilm(String people) {
        super(people);
    }
    public void film(){
        Response response = given().get(returnFilm("films[6]"));
        System.out.println(response.getStatusCode());
    }
}
