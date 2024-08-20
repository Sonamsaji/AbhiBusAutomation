package com.automation.steps;

import com.automation.pages.OfferPage;
import io.cucumber.java.en.And;

public class OfferPageSteps {
    OfferPage offerPage = new OfferPage();

    @And("the user clicks View Details button")
    public void theUserClicksViewDetailsButton() {
        offerPage.clicksViewDetails();
    }
}
