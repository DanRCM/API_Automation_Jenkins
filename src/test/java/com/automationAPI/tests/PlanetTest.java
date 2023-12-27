package com.automationAPI.tests;

import com.automationAPI.ApiResponses.PlanetFilmsApi;
import org.testng.annotations.Test;

public class PlanetTest {
    PlanetFilmsApi planetApi = new PlanetFilmsApi("/people/2");
    @Test
    public void planetTest(){
        planetApi.dataPlanet(planetApi.returnPlanet("planets[0]"));
    }
}
