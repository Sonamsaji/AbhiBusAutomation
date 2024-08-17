package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    //

    @FindBy(xpath = "//input[@placeholder='From Station']")
    WebElement fromStation;

    @FindBy(xpath = "//input[@placeholder='To Station']")
    WebElement toStation;

    @FindBy(id = "bi-direction")
    WebElement swapButton;

    @FindBy(id = "search-button")
    WebElement searchButton;



    public void openWebsite() {
        driver.get(ConfigReader.getConfigValue("url"));

    }

    public void enterFromAndToStation(){
        fromStation.sendKeys(ConfigReader.getConfigValue("fromStation"));
        toStation.sendKeys(ConfigReader.getConfigValue("toStation"));

    }




}
