package com.mentorship.action.common;

import com.google.inject.Inject;
import com.mentorship.page.home.HomePage;
import io.qameta.allure.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchAction {

    @Inject
    private HomePage homePage;

    @Step("Searching by '{0}' query")
    public SearchAction searchByText(String text) {
        homePage.enterSearchText(text);
        homePage.clickOnFirstSearchSuggestion();
        return this;
    }
}
