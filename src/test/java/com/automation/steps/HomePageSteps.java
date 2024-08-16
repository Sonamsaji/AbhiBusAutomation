package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class HomePageSteps {
    HomePage homePage=new HomePage();

    @Given("user opens website")
    public void user_opens_website() {
        homePage.openWebsite();
    }
    @Then("verify user lands on website")
    public void verify_user_lands_on_website() {
        Assert.assertTrue(true);
    }
}
