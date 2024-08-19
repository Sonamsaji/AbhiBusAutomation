package com.automation.steps;

import com.automation.pages.CancelBookingPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CancelBookingSteps {

    CancelBookingPage cancelBookingPage = new CancelBookingPage();

    @Then("verify the user is on the Cancel Booking page")
    public void verifyTheUserIsOnTheCancelBookingPage() {
        Assert.assertEquals(cancelBookingPage.userIsOnTheCancelBookingPage(), ConfigReader.getConfigValue("cancel"));
    }

    @And("the user enters an invalid {string} and {string}")
    public void theUserEntersAnInvalidAnd(String arg0, String arg1) throws InterruptedException {
        cancelBookingPage.userEntersAnInvalidData();
    }

    @Then("verify an appropriate error message is displayed to the user")
    public void verifyAnAppropriateErrorMessageIsDisplayedToTheUser() {
        Assert.assertEquals(cancelBookingPage.isErrorMessageDisplayed(),ConfigReader.getConfigValue("error"));
    }

    @When("the user clicks the chatbot icon")
    public void theUserClicksTheChatbotIcon() throws InterruptedException {
        cancelBookingPage.clicksChatBot();
        Thread.sleep(5000);
    }

    @Then("verify the chatbot box loads successfully")
    public void verifyTheChatbotBoxLoadsSuccessfully() {
        Assert.assertEquals(cancelBookingPage.isChatBotVisible(),ConfigReader.getConfigValue("chatterbox"));
    }
}
