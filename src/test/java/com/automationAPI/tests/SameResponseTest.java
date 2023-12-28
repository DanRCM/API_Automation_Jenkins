package com.automationAPI.tests;

import com.automationAPI.lib.BaseTest;
import org.testng.annotations.Test;

public class SameResponseTest extends BaseTest {

    @Test
    public void comparateTest(){
        planetResponse.comparateResponse(planetResponse.returnPlanet("planets[0]"));
    }
}
