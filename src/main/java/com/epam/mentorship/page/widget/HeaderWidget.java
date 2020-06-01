package com.epam.mentorship.page.widget;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class HeaderWidget {

    private final SelenideElement headerLogo = $x("//*[contains(@class,'logo-fr24-flat')]");

    private final SelenideElement appsButton = $x("//*[@id='navTopApps']");

    private final SelenideElement addCoverageButton = $x("//*[@id='navTopAddCoverage']");

    private final SelenideElement dataHistoryButton = $x("//*[@id='navTopDataHistory']");

    private final SelenideElement socialButton = $x("//*[@id='navTopSocial']");

    private final SelenideElement pressButton = $x("//*[@id='navTopPress']");

    private final SelenideElement aboutButton = $x("//*[@id='navTopAbout']");

    private final SelenideElement commercialServicesButton = $x("//*[@id='navTopBusiness']");

    private final SelenideElement applyForReceiverLink = $x("//*[@id='navTopAddCoverageApplyForReceiver']");

    private final SelenideElement addCoverageLink = $x("//*[@id='navTopAddCoverageAddCoverage']");

    private final SelenideElement shareDataLink = $x("//*[@id='navTopAddCoverageShareYourData']");

    private final SelenideElement buildOwnLink = $x("//*[@id='navTopAddCoverageBuildYourOwn']");

    private final SelenideElement shareStatisticsLink = $x("//*[@id='navTopAddCoverageShareStatistics']");

    private final SelenideElement searchLink = $x("//*[@id='navTopDataHistoryDataHistory']");

    private final SelenideElement airportsLink = $x("//*[@id='navTopDataHistoryAirports']");

    private final SelenideElement airlinesLink = $x("//*[@id='navTopDataHistoryAirlines']");

    private final SelenideElement aircraftLink = $x("//*[@id='navTopDataHistoryAirline']");

    private final SelenideElement flightsLink = $x("//*[@id='navTopDataHistoryFlights']");

    private final SelenideElement pinnedFlightLinks = $x("navTopDataHistoryPinned");

    private final SelenideElement statisticsLinks = $x("//*[@id='navTopDataHistoryStatistics']");

    private final SelenideElement logInButton = $(".premium-menu-title-login");

    public void clickOnCommercialServiceButton() {
        commercialServicesButton.click();
    }

    public void clickOnAboutButton() {
        aboutButton.click();
    }

    public void clickOnPressButton() {
        pressButton.click();
    }

    public void clickOnSocialButton() {
        socialButton.click();
    }

    public void clickOnDataHistoryButton() {
        dataHistoryButton.click();
    }

    public void clickOnAppsButton() {
        appsButton.click();
    }

    public void clickOnAddCoverageButton() {
        addCoverageButton.click();
    }

    public void clickOnHeaderLogo() {
        headerLogo.click();
    }

    public void clickOnAddCoverageLink() {
        addCoverageLink.click();
    }

    public void clickOnApplyForReceiverLink() {
        applyForReceiverLink.click();
    }

    public void clickOnShareDataLink() {
        shareDataLink.click();
    }

    public void clickOnBuildOwnLink() {
        buildOwnLink.click();
    }

    public void clickOnShareStatisticsLink() {
        shareStatisticsLink.click();
    }

    public void clickOnSearchLink() {
        searchLink.click();
    }

    public void clickOnAirportsLink() {
        airportsLink.click();
    }

    public void clickOnAirlinesLink() {
        airlinesLink.click();
    }

    public void clickOnAircraftLink() {
        aircraftLink.click();
    }

    public void clickOnFlightsLink() {
        flightsLink.click();
    }

    public void clickOnPinnedFlightLinks() {
        pinnedFlightLinks.click();
    }

    public void clickOnStatisticsLinks() {
        statisticsLinks.click();
    }

    public boolean isHeaderLogoVisible() {
        return headerLogo.isDisplayed();
    }

    public void clickOnLogInButton() {
        logInButton.click();
    }

    public boolean isLogInButtonVisible() {
        return headerLogo.isDisplayed();
    }

}
