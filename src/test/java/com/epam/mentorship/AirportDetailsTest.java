package com.epam.mentorship;

import com.epam.mentorship.action.common.NavigationAction;
import com.epam.mentorship.action.common.SearchAction;
import com.epam.mentorship.assertion.airport.AirportDetailsAssertion;
import com.epam.mentorship.model.AirportDetailsDto;
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
                .code("LWO/UK LL")
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
