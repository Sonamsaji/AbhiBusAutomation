package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CancelBookingPage extends BasePage {

    //locator for getting cancel Ticket Text
    @FindBy(xpath = "//div[@class=\"jrnytye\"]//h1")
    WebElement cancelText;

    //locator for entering ticket number
    @FindBy(id = "ticket_num")
    WebElement ticketNumber;

    //locator for entering phone number
    @FindBy(id = "phonenum")
    WebElement phoneNumber;

    //locator for clicking retrieve button
    @FindBy(xpath = "//*[@id=\"Form1\"]//div[4]/input")
    WebElement retrieveButton;

    //locator for getting error text
    @FindBy(xpath = "//*[@id=\"txtCanc\"]/div")
    WebElement errorText;


    //locator for clicking chat bot
    @FindBy(className = "verloop-button")
    WebElement chatBot;

    //locator for getting chatbot box text
    @FindBy(xpath = "//*[@id='chat-window-wrapper']/div/div[1]/div[1]/span")
    WebElement botText;

    public String userIsOnTheCancelBookingPage() {
        return cancelText.getText();
    }

    public void userEntersAnInvalidData() throws InterruptedException {
        ticketNumber.sendKeys(ConfigReader.getConfigValue("ticketNumber"));
        phoneNumber.sendKeys(ConfigReader.getConfigValue("phoneNumber"));
        retrieveButton.click();
        Thread.sleep(4000);
    }

    public String isErrorMessageDisplayed() {
        return errorText.getText();
    }

    public void clicksChatBot() {
        chatBot.click();
    }

    public String isChatBotVisible() {
        // Switch to the iframe using its XPath
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='verloop-iframe']")));
        return botText.getText();
    }
}
