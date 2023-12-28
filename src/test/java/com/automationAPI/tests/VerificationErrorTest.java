package com.automationAPI.tests;

import com.automationAPI.lib.BaseTest;
import org.testng.annotations.Test;

public class VerificationErrorTest extends BaseTest {
    @Test
    public void getStatusCodefilm(){
        verificationFilmByPath("/films/7/", 404);
    }
}
