package com.mentorship.assertion.home;

import com.google.inject.Inject;
import com.mentorship.page.home.HomePage;
import io.qameta.allure.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.testng.Assert.assertTrue;

public class HomePageAssertion {

    @Inject
    private HomePage homePage;

    @Step("Verify main page loaded")
    public HomePageAssertion assertMainPageLoaded() {
        assertTrue(homePage.getHeaderWidget().isHeaderLogoVisible(), "Header logo should be visible");
        assertTrue(homePage.getHeaderWidget().isLogInButtonVisible(), "Log In button should be visible");
        assertTrue(homePage.isMapCanvasVisible(), "Map canvas should be visible");
        return this;
    }
}
