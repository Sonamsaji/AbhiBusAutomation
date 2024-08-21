package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FAQPage extends BasePage {

    //locator for
    @FindBy(xpath = "//*[@id=\"Faqs-data\"]/div")
    WebElement faqData;
    //locator for FAQ text
    @FindBy(xpath = "//div[@class=\"container card   md \"]//h5")
    WebElement faqText;
    //locator for content inside faq
    @FindBy(xpath = "//div[@class=\"row collapsible-body \"]")
    WebElement faqContent;
    //locator for whole faq box to load
    @FindBy(className = "faq")
    WebElement faqWait;

    public String onFAQPage() {
        return faqText.getText();
    }

    public void userClicksKeydown() {
        wait.until(ExpectedConditions.elementToBeClickable(faqWait));
        faqData.click();
    }

    public String isKeyDownWorking() {
        return faqContent.getText();
    }
}
