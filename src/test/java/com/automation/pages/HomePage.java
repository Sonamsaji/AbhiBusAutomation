package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    //locator for getting fish icon


    public void openWebsite() {
        driver.get(ConfigReader.getConfigProperty("url"));

    }




}
