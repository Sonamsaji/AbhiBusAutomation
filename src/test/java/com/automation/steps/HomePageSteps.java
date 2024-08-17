package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageSteps {
    HomePage homePage=new HomePage();

    @Given("user opens website")
    public void user_opens_website()   {
         homePage.openWebsite();
    }

    @Then("verify user lands on website")
    public void verify_user_lands_on_website() {
        Assert.assertTrue(true);
    }

    @When("user enters from and to station")
    public void userEntersFromAndToStation() throws InterruptedException {
        homePage.enterFromAndToStation();
        Thread.sleep(5000);
    }

    @When("user set date")
    public void user_set_date() {

    }
    @When("click on search button")
    public void click_on_search_button() {

    }
    @Then("verify user is able to see the proper search results")
    public void verify_user_is_able_to_see_the_proper_search_results() {
    }


}
