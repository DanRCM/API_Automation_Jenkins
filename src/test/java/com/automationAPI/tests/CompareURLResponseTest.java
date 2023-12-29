package com.automationAPI.tests;

import com.automationAPI.lib.BaseTest;
import org.testng.annotations.Test;

public class CompareURLResponseTest extends BaseTest {

    @Test
    public void comparateTest(){
        compareResponse(dataFilms.returnPlanet("planets[0]","films[5]"),"url");
    }
}
