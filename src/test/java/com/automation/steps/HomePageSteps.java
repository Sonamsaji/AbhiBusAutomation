package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Given;


public class HomePageSteps {

    HomePage homePage=new HomePage();

    @Given("user opens website")
    public void user_opens_website()  {
         homePage.openWebsite();
    }

}
