package com.automationAPI.tests;

import com.automationAPI.lib.BaseTest;
import org.testng.annotations.Test;

public class PlanetTest extends BaseTest {
    @Test
    public void planetTest(){
        planetApi.dataPlanet(planetApi.returnPlanet("planets[0]"));
    }
}
