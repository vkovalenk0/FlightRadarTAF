package com.mentorship.assertion.airport;

import com.mentorship.model.AirportDetailsDto;
import com.mentorship.page.widget.AirportDetailsWidget;
import com.google.inject.Inject;

import static org.testng.Assert.*;

public class AirportDetailsAssertion {

    @Inject
    private AirportDetailsWidget airportDetailsWidget;

    public AirportDetailsAssertion assertDetailsWidgetVisible() {
        assertTrue(airportDetailsWidget.isAirportWidgetWrapperVisible(), "Airport widget should be visible");
        return this;
    }

    public AirportDetailsAssertion assertDetailsWidgetNotVisible() {
        assertFalse(airportDetailsWidget.isAirportWidgetWrapperVisible(), "Airport widget shouldn't be visible");
        return this;
    }

    public AirportDetailsAssertion assertAirportInfo(AirportDetailsDto airportDetailsDto) {
        assertEquals(airportDetailsWidget.getAirportName(), airportDetailsDto.getName(), "Airport name should match");
        assertEquals(airportDetailsWidget.getAirportCode(), airportDetailsDto.getCode(), "Airport code should match");
        return this;
    }
}
