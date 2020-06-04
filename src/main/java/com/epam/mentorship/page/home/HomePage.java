package com.epam.mentorship.page.home;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.epam.mentorship.page.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;

public class HomePage extends BasePage {

    private final SelenideElement mapCanvas = $("#map_canvas");

    private final SelenideElement searchInput = $(By.id("searchBox"));

    private final ElementsCollection searchSuggestions =
            $$x("//*[contains(@class, 'ui-autocomplete')]//*[@class='ui-menu-item']");

    public boolean isMapCanvasVisible() {
        return mapCanvas.isDisplayed();
    }

    public void enterSearchText(String text) {
        searchInput.shouldBe(Condition.visible).setValue(text);
    }

    public void clickOnFirstSearchSuggestion() {
        searchSuggestions.first().shouldBe(Condition.visible).click();
    }
}
