package com.mentorship;

import com.google.gson.Gson;
import com.google.inject.Inject;
import com.mentorship.action.common.NavigationAction;
import com.mentorship.action.login.UserLoginAction;
import com.mentorship.assertion.home.HomePageAssertion;
import com.mentorship.model.UserDto;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LogInTest extends BaseTest {

    @Inject
    private NavigationAction navigationAction;

    @Inject
    private UserLoginAction userLoginAction;

    @Inject
    private HomePageAssertion homePageAssertion;

    @Test(description = "Verify ability for user to log in")
    public void verifyAbilityForUserToLogInToSite() throws FileNotFoundException {
        navigationAction.openHomePage();
        homePageAssertion.assertMainPageLoaded();
        userLoginAction.logInAsUser(getFirstUserFromJson());
        // TODO add assertion here
    }

    // TODO delete later
    private UserDto getFirstUserFromJson() throws FileNotFoundException {
        return new Gson().fromJson(new BufferedReader(new FileReader("src/test/resources/data/users.json")), UserDto[].class)[0];
    }
}
