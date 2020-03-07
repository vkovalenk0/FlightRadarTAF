package com.epam.mentorship.po.widget;

import com.epam.mentorship.po.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderWidget extends BasePage {

    @FindBy(xpath = "//*[contains(@class,'logo-fr24-flat')]")
    private WebElement headerLogo;

    @FindBy(xpath = "//*[@id='navTopApps']")
    private WebElement appsButton;

    @FindBy(xpath = "//*[@id='navTopAddCoverage']")
    private WebElement addCoverageButton;

    @FindBy(xpath = "//*[@id='navTopDataHistory']")
    private WebElement dataHistoryButton;

    @FindBy(xpath = "//*[@id='navTopSocial']")
    private WebElement socialButton;

    @FindBy(xpath = "//*[@id='navTopPress']")
    private WebElement pressButton;

    @FindBy(xpath = "//*[@id='navTopAbout']")
    private WebElement aboutButton;

    @FindBy(xpath = "//*[@id='navTopBusiness']")
    private WebElement commercialServicesButton;

    @FindBy(xpath = "//*[@id='navTopAddCoverageApplyForReceiver']")
    private WebElement applyForReceiverLink;

    @FindBy(xpath = "//*[@id='navTopAddCoverageAddCoverage']")
    private WebElement addCoverageLink;

    @FindBy(xpath = "//*[@id='navTopAddCoverageShareYourData']")
    private WebElement shareDataLink;

    @FindBy(xpath = "//*[@id='navTopAddCoverageBuildYourOwn']")
    private WebElement buildOwnLink;

    @FindBy(xpath = "//*[@id='navTopAddCoverageShareStatistics']")
    private WebElement shareStatisticsLink;

    @FindBy(xpath = "//*[@id='navTopDataHistoryDataHistory']")
    private WebElement searchLink;

    @FindBy(xpath = "//*[@id='navTopDataHistoryAirports']")
    private WebElement airportsLink;

    @FindBy(xpath = "//*[@id='navTopDataHistoryAirlines']")
    private WebElement airlinesLink;

    @FindBy(xpath = "//*[@id='navTopDataHistoryAirline']")
    private WebElement aircraftLink;

    @FindBy(xpath = "//*[@id='navTopDataHistoryFlights']")
    private WebElement flightsLink;

    @FindBy(xpath = "navTopDataHistoryPinned")
    private WebElement pinnedFlightLinks;

    @FindBy(xpath = "//*[@id='navTopDataHistoryStatistics']")
    private WebElement statisticsLinks;

    public HeaderWidget(WebDriver driver) {
        super(driver);
    }

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
}
