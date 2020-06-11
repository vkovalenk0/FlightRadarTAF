package com.mentorship.action.common;

import com.codeborne.selenide.Selenide;
import com.mentorship.page.widget.CookiesWidget;
import com.google.inject.Inject;
import io.qameta.allure.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NavigationAction {

    private static final Logger LOG = LoggerFactory.getLogger(NavigationAction.class);

    @Inject
    private CookiesWidget cookiesWidget;

    @Step("Open Home page")
    public NavigationAction openHomePage() {
        Selenide.open("");
        cookiesWidget.clickCloseCookiesWidget();
        return this;
    }
}
