package com.automationAPI.tests;

import com.automationAPI.ApiResponses.VerificationFilm;
import org.testng.annotations.Test;

public class VerificationTest {
    VerificationFilm verificationFilm = new VerificationFilm("/people/2/");

    @Test
    public void film7(){
        verificationFilm.film();
    }
}
