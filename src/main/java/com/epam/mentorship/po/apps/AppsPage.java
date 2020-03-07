package com.epam.mentorship.po.apps;

import com.epam.mentorship.po.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AppsPage extends BasePage {

    @FindBy(xpath = "//a[contains(@href, 'apple-store')]")
    private WebElement appStoreImage;

    @FindBy(xpath = "//div[@class='app-buttons']//a[contains(@href, 'flightradar24free&')]")
    private WebElement googlePlayImage;

    @FindBy(xpath = "//div[@id='ios']//img[contains(@src,'screenshots')]")
    private List<WebElement> iosAppImages;

    @FindBy(xpath = "//div[@id='android']//img[contains(@src,'screenshots')]")
    private List<WebElement> androidAppImages;

    @FindBy(xpath = "//a[contains(@data-content,'ios')]")
    private WebElement iosTab;

    @FindBy(xpath = "//a[contains(@data-content,'android')]")
    private WebElement androidTab;

    @FindBy(xpath = "//div[@class='content-row description']/p")
    private WebElement appDescriptionText;

    @FindBy(xpath = "//div[@class='content']/h1")
    private WebElement appDescriptionLabel;

    public AppsPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnIosTab() {
        iosTab.click();
    }

    public void clickOnAndroidTab() {
        androidTab.click();
    }

    public boolean isAppDescriptionTextDisplayed() {
        return appDescriptionText.isDisplayed();
    }

    public boolean isAppDescriptionLabelDisplayed() {
        return appDescriptionLabel.isDisplayed();
    }

    public boolean isAppStoreImageDisplayed() {
        return appStoreImage.isDisplayed();
    }

    public boolean isGooglePlayImageDisplayed() {
        return googlePlayImage.isDisplayed();
    }
}
