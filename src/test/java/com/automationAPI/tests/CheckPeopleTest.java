package com.automationAPI.tests;
import com.automationAPI.lib.BaseTest;
import org.testng.annotations.Test;

public class CheckPeopleTest extends BaseTest {
    @Test
    public void skin_and_filmTests(){
        peopleInformation.skin_colorTest();
        peopleInformation.filmsTest();
    }
}
