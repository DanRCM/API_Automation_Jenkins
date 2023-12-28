package com.automationAPI.tests;

import com.automationAPI.lib.BaseTest;
import org.testng.annotations.Test;

public class VerificationErrorTest extends BaseTest {
    @Test
    public void film7(){
        verificationFilm.film("/films/7/");
    }
}
