package com.automationAPI.tests;

import com.automationAPI.lib.BaseTest;
import org.testng.annotations.Test;

public class FilmTest extends BaseTest{
    @Test
    public void dateTest(){
        dataFilms.dateFormatTest(dataFilms.returnFilm("films[1]"));
        dataFilms.verifyDataInFilm(dataFilms.returnFilm("films[1]"));
    }
}