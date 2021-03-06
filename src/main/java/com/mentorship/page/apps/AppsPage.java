package com.mentorship.page.apps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.mentorship.page.BasePage;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class AppsPage extends BasePage {

    private final SelenideElement appStoreImage = $x("//a[contains(@href, 'apple-store')]");

    private final SelenideElement googlePlayImage = $x("//div[@class='app-buttons']//a[contains(@href, 'flightradar24free&')]");

    private final ElementsCollection iosAppImages = $$x("//div[@id='ios']//img[contains(@src,'screenshots')]");

    private final ElementsCollection androidAppImages = $$x("//div[@id='android']//img[contains(@src,'screenshots')]");

    private final SelenideElement iosTab = $x("//a[contains(@data-content,'ios')]");

    private final SelenideElement androidTab = $x("//a[contains(@data-content,'android')]");

    private final SelenideElement appDescriptionText = $x("//div[@class='content-row description']/p");

    private final SelenideElement appDescriptionLabel = $x("//div[@class='content']/h1");

    public void clickOnIosTab() {
        iosTab.click();
    }

    public void clickOnAndroidTab() {
        androidTab.click();
    }

    public boolean isAppDescriptionTextDisplayed() {
        return appDescriptionText.is(Condition.visible);
    }

    public boolean isAppDescriptionLabelDisplayed() {
        return appDescriptionLabel.is(Condition.visible);
    }

    public boolean isAppStoreImageDisplayed() {
        return appStoreImage.is(Condition.visible);
    }

    public boolean isGooglePlayImageDisplayed() {
        return googlePlayImage.is(Condition.visible);
    }
}
