package com.automation.steps;

import com.automation.pages.BusSearchResultPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class BusSearchResultPageSteps {
    BusSearchResultPage searchResultPage = new BusSearchResultPage();

    @Then("verify user is on search result page")
    public void verify_user_is_on_search_result_page() {
        System.out.println(searchResultPage.isUserOnSearchResultPage());
        Assert.assertTrue(searchResultPage.isUserOnSearchResultPage());
    }
}
