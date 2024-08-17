package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(id = "search-from")
    WebElement fromStation;

    @FindBy(id = "search-to")
    WebElement toStation;

    @FindBy(id = "bi-direction")
    WebElement swapButton;

    @FindBy(id = "search-button")
    WebElement searchButton;

    @FindBy(xpath="//input[@placeholder='Onward Journey Date']")
    WebElement dateInputField;

    @FindBy(xpath="//div[2]/div[1]/div[2]/span[1]")
    WebElement month;

    @FindBy(xpath="//div[1]/div[2]/span[2]")
    WebElement year;

    @FindBy(xpath = "//div[@class=' col auto'][2]/span[@class='calender-month-change']")
    WebElement forwardChangeOfMonth;

    //locator for CareerIcon
    @FindBy(id = "carreers-link")
    WebElement careerIcon;

    public int monthNumber(){
        int c=0;
        String [] listOfMonth={"January","February","March","April","May","June","July","August","September","October","November","December"};
        for(int i=0;i<listOfMonth.length;i++){
            if(ConfigReader.getConfigValue("month").equals(listOfMonth[i])) {
                c = i + 1;
                break;
            }
        }
        return c;
    }
    public void openWebsite() {
        driver.get(ConfigReader.getConfigValue("url"));

    }
    public void enterFromAndToStation(){
        fromStation.click();
        String fromCity="//div[text()='"+ConfigReader.getConfigValue("fromStation")+"']";
        driver.findElement(By.xpath(fromCity)).click();
        toStation.click();
        String toCity="//div[text()='"+ConfigReader.getConfigValue("toStation")+"']";
        driver.findElement(By.xpath(toCity)).click();

    }
    public void enterDate(){

        dateInputField.click();
        while(!month.getText().equals(ConfigReader.getConfigValue("month")))
        {
            forwardChangeOfMonth.click();
        }

        String dateXpath="//div[2]/span[@data-date='"+ConfigReader.getConfigValue("day")+"' and @data-month='"+monthNumber()+"']";
        WebElement date=driver.findElement(By.xpath(dateXpath));
        date.click();
    }
    public void clickOnSearchButton(){
        searchButton.click();
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
