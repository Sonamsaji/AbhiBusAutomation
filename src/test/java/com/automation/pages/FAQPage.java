package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FAQPage extends BasePage{

    //locator for
    @FindBy(xpath = "//*[@id=\"Faqs-data\"]/div[1]")
    WebElement faqData;
    //locator for FAQ text
    @FindBy(xpath = "//div[@class=\"container card   md \"]//h5")
    WebElement faqText;
    //locator for
    @FindBy(xpath = "//div[@class=\"row collapsible-body \"]")
    WebElement faqContent ;

    public String  onFAQPage() {
        return faqText.getText();
    }

    public void userClicksKeydown() {
        faqData.click();
    }

    public String isKeyDownWorking() {
        return faqContent.getText();
    }
}
