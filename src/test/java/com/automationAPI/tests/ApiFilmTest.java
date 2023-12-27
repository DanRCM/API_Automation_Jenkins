package com.automationAPI.tests;

import com.automationAPI.ApiResponses.DataFilmsApi;
import org.testng.annotations.Test;

public class ApiFilmTest {
    DataFilmsApi dataFilmsApi = new DataFilmsApi("/people/2");
    @Test
    public void dateTest(){
        dataFilmsApi.dateFormatTest(dataFilmsApi.returnFilm("films[1]"));
        dataFilmsApi.verifyDataInFilm(dataFilmsApi.returnFilm("films[1]"));
    }
}