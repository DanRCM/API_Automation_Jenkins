package com.automationAPI.tests;
import com.automationAPI.ApiResponses.PeopleApi;
import org.testng.annotations.Test;

public class CheckPeopleTest {
    PeopleApi peopleApi = new PeopleApi("/people/2");
    @Test
    public void skin_and_filmTests(){
        peopleApi.skin_colorTest();
        peopleApi.filmsTest();
    }
}
