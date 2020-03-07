package com.epam.mentorship.po.datahistory;

import com.epam.mentorship.po.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AirportsPage extends BasePage {

    @FindBy(xpath = "//input[@id='searchAirport']")
    private WebElement searchAirportInput;

    @FindBy(xpath = "//div[@class='input-group-addon']//i")
    private WebElement searchAirportButton;

    public AirportsPage(WebDriver driver) {
        super(driver);
    }
}
