package com.mentorship.action.login;

import com.google.inject.Inject;
import com.mentorship.model.UserDto;
import com.mentorship.page.widget.HeaderWidget;
import io.qameta.allure.Step;

public class UserLoginAction {

    @Inject
    private HeaderWidget headerWidget;

    @Step("Log in as user: {0}")
    public UserLoginAction logInAsUser(UserDto userDto) {
        headerWidget.clickOnLogInButton();
        headerWidget.typeEmail(userDto.getEmail());
        headerWidget.typePassword(userDto.getPassword());
        headerWidget.clickLogInConfirmButton();
        return this;
    }
}
