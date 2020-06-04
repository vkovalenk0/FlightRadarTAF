package com.epam.mentorship.action.common;

import com.codeborne.selenide.Selenide;
import com.epam.mentorship.page.widget.CookiesWidget;
import com.google.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NavigationAction {

    private static final Logger LOG = LoggerFactory.getLogger(NavigationAction.class);

    @Inject
    private CookiesWidget cookiesWidget;

    public NavigationAction openHomePage() {
        LOG.info("Open Home page");
        Selenide.open("");
        cookiesWidget.clickCloseCookiesWidget();
        return this;
    }
}
