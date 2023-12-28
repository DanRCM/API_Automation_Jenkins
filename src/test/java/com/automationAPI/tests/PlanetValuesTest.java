package com.automationAPI.tests;

import com.automationAPI.lib.BaseTest;
import org.testng.annotations.Test;

public class PlanetValuesTest extends BaseTest {
    @Test
    public void planetValuesTest(){
        planetFilms.dataPlanet(planetFilms.returnPlanet("planets[0]","films[5]"));
    }
}
