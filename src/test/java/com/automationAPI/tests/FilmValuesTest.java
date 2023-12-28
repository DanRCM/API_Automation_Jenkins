package com.automationAPI.tests;

import com.automationAPI.lib.BaseTest;
import org.testng.annotations.Test;

public class FilmValuesTest extends BaseTest{
    @Test
    public void dataTest(){
        dataFilms.dateFormatTest(dataFilms.returnFilm("films[1]"));
        dataFilms.verifyDataInFilm(dataFilms.returnFilm("films[1]"));
    }
}