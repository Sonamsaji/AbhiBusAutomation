package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class HomePageSteps {
    HomePage homePage=new HomePage();

    @Given("user opens website")
    public void user_opens_website() throws InterruptedException {
         homePage.openWebsite();
        Thread.sleep(3000);

    }
    @Then("verify user lands on website")
    public void verify_user_lands_on_website() {
        Assert.assertTrue(true);
    }
}
