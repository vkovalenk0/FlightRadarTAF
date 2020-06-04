package com.mentorship.assertion.home;

import com.mentorship.page.home.HomePage;
import com.google.inject.Inject;

import static org.testng.Assert.assertTrue;

public class HomePageAssertion {

    @Inject
    private HomePage homePage;

    public HomePageAssertion assertMainPageLoaded() {
        assertTrue(homePage.getHeaderWidget().isHeaderLogoVisible(), "Header logo should be visible");
        assertTrue(homePage.getHeaderWidget().isLogInButtonVisible(), "Log In button should be visible");
        assertTrue(homePage.isMapCanvasVisible(), "Map canvas should be visible");
        return this;
    }
}
