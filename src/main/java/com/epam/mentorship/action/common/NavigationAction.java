package com.epam.mentorship.action.common;

import com.codeborne.selenide.Selenide;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NavigationAction {

    private static final Logger LOG = LoggerFactory.getLogger(NavigationAction.class);

    public NavigationAction openHomePage() {
        LOG.info("Open Home page");
        Selenide.open("");
        return this;
    }
}
