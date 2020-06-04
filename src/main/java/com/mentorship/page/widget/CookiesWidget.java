package com.mentorship.page.widget;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CookiesWidget {

    private final SelenideElement closeCookiesWidget = $(".important-banner__footer .btn");

    public void clickCloseCookiesWidget() {
        closeCookiesWidget.shouldBe(Condition.visible).click();
    }
}
