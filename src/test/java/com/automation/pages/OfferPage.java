package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OfferPage extends BasePage {

    //locator for clicking first view details option
    @FindBy(xpath = "//*[@id=\"offer-cards-tab-details\"]/div[1]/div[2]/div[2]/a/span")
    WebElement viewDetails;
    //locator for clicking copy code
    @FindBy(xpath = "//div[@class=\" col s6 m6 l6\"]//button")
    WebElement copyCode;
    //locator for getting code copied message
    @FindBy(className = "row text-success")
    WebElement codeCopiedMessage;
    //locator for loading whole container
    @FindBy(id = "search-container")
    WebElement loadPage;

    public void clicksViewDetails() {
        wait.until(ExpectedConditions.elementToBeClickable(loadPage));
        viewDetails.click();
    }

    public void clicksCopyCode() {
        copyCode.click();
    }

    public boolean isCodeCopied() {
        return isDisplayed(codeCopiedMessage);
    }
}
