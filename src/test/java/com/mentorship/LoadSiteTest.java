package com.mentorship;

import com.mentorship.action.common.NavigationAction;
import com.mentorship.assertion.home.HomePageAssertion;
import com.google.inject.Inject;
import org.testng.annotations.Test;

public class LoadSiteTest extends BaseTest {

    @Inject
    private NavigationAction navigationAction;

    @Inject
    private HomePageAssertion homePageAssertion;

    @Test(description = "Verify ability for guest user to load main page and see site components")
    public void verifyAbilityForGuestToLoadSite() {
        navigationAction.openHomePage();
        homePageAssertion.assertMainPageLoaded();
    }

}
