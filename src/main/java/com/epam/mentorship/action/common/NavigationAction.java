package com.epam.mentorship.action.common;

import com.codeborne.selenide.Selenide;

public class NavigationAction {

    public NavigationAction openHomePage() {
        Selenide.open("");
        return this;
    }
}
