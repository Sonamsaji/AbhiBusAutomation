package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OfferPage extends BasePage{

    //locator for clicking first view details option
    @FindBy(xpath = "//div[@class=\" col auto\"]//a//span[text()='View Details']")
    WebElement viewDetails;

    public void clicksViewDetails() {
        viewDetails.click();
    }
}
