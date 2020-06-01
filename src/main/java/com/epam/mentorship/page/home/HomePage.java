package com.epam.mentorship.page.home;

import com.codeborne.selenide.SelenideElement;
import com.epam.mentorship.page.BasePage;

import static com.codeborne.selenide.Selenide.$;

public class HomePage extends BasePage {

    private final SelenideElement mapCanvas = $("#map_canvas");

    public boolean isMapCanvasVisible() {
        return mapCanvas.isDisplayed();
    }
}
