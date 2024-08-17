package com.automation.steps;

import com.automation.pages.CareerPage;
import com.automation.pages.JobDescriptionPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CareerPageSteps {

    CareerPage careerPage = new CareerPage();

    @Then("verify user is on the Careers page")
    public void verifyUserIsOnTheCareersPage() throws InterruptedException {
        Assert.assertEquals(careerPage.userIsOnTheCareersPage(), ConfigReader.getConfigValue("careers.text"));
        Thread.sleep(5000);
    }

    @And("user clicks on any job title")
    public void userClicksOnAnyJobTitle() throws InterruptedException {
        careerPage.scrollUntilTextComes();
        Thread.sleep(5000);
        careerPage.userClicksJobTitle();
        careerPage.userSwitchToJobDescriptionPage();
    }

    @Then("verify user is on the job description page")
    public void verifyUserIsOnTheJobDescriptionPage() throws InterruptedException {
        Assert.assertEquals(careerPage.userIsOnJobDescriptionPage(), ConfigReader.getConfigValue("job.text"));
        Thread.sleep(4000);
    }
}
