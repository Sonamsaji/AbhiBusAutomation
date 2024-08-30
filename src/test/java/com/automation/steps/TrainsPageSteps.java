package com.automation.steps;

import com.automation.pages.web.TrainsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class TrainsPageSteps {

    TrainsPage trainsPage = new TrainsPage();

    @Then("verify the user is on the Train Ticket Booking page")
    public void verifyTheUserIsOnTheTrainTicketBookingPage() {
        Assert.assertTrue(trainsPage.verifyUserIsOnTheTrainTicketBookingPage());
    }

    @And("the user clicks the search button")
    public void theUserClicksTheSearchButton() {
        trainsPage.userClicksTheSearchButton();
    }


    @Then("verify search result is displayed")
    public void verifySearchResultIsDisplayed() {
        Assert.assertTrue(trainsPage.filterAndSortIsDisplayed());
    }

    @And("the user clicks on duration filter")
    public void theUserClicksOnDurationFilter() {
        trainsPage.userClicksOnDurationIcon();
    }

    @Then("the filtered list of trains should be displayed correctly")
    public void theFilteredListOfTrainsShouldBeDisplayedCorrectly() {
        // Step 4: Assert that the list is sorted in ascending order
        Assert.assertTrue(trainsPage.isDurationFilterWorking());
    }

    @And("the user applies some filters")
    public void theUserAppliesSomeFilters() {
        trainsPage.userClicksOriginStationFilter();
        trainsPage.userClicksOnDestinationStation();
    }

    @Then("verify the filtered list of trains is displayed")
    public void verifyTheFilteredListOfTrainsIsDisplayed() {
        trainsPage.verifyFilterWorked();
    }

    @And("the user clicks the Reset All button")
    public void theUserClicksTheResetAllButton() {
        trainsPage.clickResetButton();
    }

    @Then("verify all filters are reset")
    public void verifyAllFiltersAreReset() {
        trainsPage.filtersAreReset();
    }
}
