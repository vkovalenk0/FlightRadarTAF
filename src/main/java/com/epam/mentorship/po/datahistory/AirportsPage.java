package com.epam.mentorship.po.datahistory;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.epam.mentorship.po.BasePage;

public class AirportsPage extends BasePage {

    private final SelenideElement searchAirportInput = Selenide.$x("//input[@id='searchAirport']");

    private final SelenideElement searchAirportButton = Selenide.$x("//div[@class='input-group-addon']//i");
}
