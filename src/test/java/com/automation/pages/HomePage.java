package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

    //locator for CareerIcon
    @FindBy(id = "carreers-link")
    WebElement careerIcon;

    public void openWebsite() {
        driver.get(ConfigReader.getConfigValue("url"));

    }

    public void enterFromAndToStation() {
        fromStation.sendKeys(ConfigReader.getConfigValue("fromStation"));
        toStation.sendKeys(ConfigReader.getConfigValue("toStation"));

    }

    public void userClicksCareerIcon() {
        careerIcon.click();
    }

    public void scrollUntilFooter() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement footerText = driver.findElement(By.xpath("//*[@id=\"footer-copyright\"]//div[2]"));
        js.executeScript("arguments[0].scrollIntoView(true);", footerText);
        js.executeScript("arguments[0].click();", footerText);
    }

}
