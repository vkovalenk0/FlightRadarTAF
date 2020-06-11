package com.mentorship.assertion.airport;

import com.google.inject.Inject;
import com.mentorship.model.AirportDetailsDto;
import com.mentorship.page.widget.AirportDetailsWidget;
import io.qameta.allure.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.testng.Assert.*;

public class AirportDetailsAssertion {
    private static final Logger LOG = LoggerFactory.getLogger(AirportDetailsAssertion.class);
    @Inject
    private AirportDetailsWidget airportDetailsWidget;

    @Step("Verify details widget is visible")
    public AirportDetailsAssertion assertDetailsWidgetVisible() {
        assertTrue(airportDetailsWidget.isAirportWidgetWrapperVisible(), "Airport widget should be visible");
        return this;
    }

    @Step("Verify details widget is not visible")
    public AirportDetailsAssertion assertDetailsWidgetNotVisible() {
        assertFalse(airportDetailsWidget.isAirportWidgetWrapperVisible(), "Airport widget shouldn't be visible");
        return this;
    }

    @Step("Verify airport info is correct: {0}")
    public AirportDetailsAssertion assertAirportInfo(AirportDetailsDto airportDetailsDto) {
        assertEquals(airportDetailsWidget.getAirportName(), airportDetailsDto.getName(), "Airport name should match");
        assertEquals(airportDetailsWidget.getAirportCode(), airportDetailsDto.getCode(), "Airport code should match");
        return this;
    }
}
