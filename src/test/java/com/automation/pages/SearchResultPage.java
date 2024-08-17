package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage{

    @FindBy(xpath = "//div[@class='title col auto']/span")
    WebElement sortByTitle;

    @FindBy(xpath = "//div[@id='seat-filter-clear-all']/p")
    WebElement filterTitle;

    public boolean isUserOnSearchResultPage(){
        return isDisplayed(filterTitle) && isDisplayed(sortByTitle);
    }
}
