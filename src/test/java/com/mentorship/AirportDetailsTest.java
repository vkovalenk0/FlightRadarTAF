package com.mentorship;

import com.mentorship.action.common.NavigationAction;
import com.mentorship.action.common.SearchAction;
import com.mentorship.assertion.airport.AirportDetailsAssertion;
import com.mentorship.model.AirportDetailsDto;
import com.google.inject.Inject;
import org.testng.annotations.Test;

public class AirportDetailsTest extends BaseTest {

    @Inject
    private NavigationAction navigationAction;
    @Inject
    private SearchAction searchAction;
    @Inject
    private AirportDetailsAssertion airportDetailsAssertion;

    @Test(description = "Verify ability for guest user to see airport details")
    public void verifyAbilityForGuestToSeeAirportDetails() {
        // Given
        AirportDetailsDto airportDto = AirportDetailsDto.builder()
                .name("Lviv Danylo Halytskyi International Airport")
                .code("LWO/UKLL")
                .build();

        navigationAction.openHomePage();
        // When
        searchAction.searchByText("LWO");
        // Then
        airportDetailsAssertion
                .assertDetailsWidgetVisible()
                .assertAirportInfo(airportDto);
    }

}
