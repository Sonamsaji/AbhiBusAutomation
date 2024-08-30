package com.automation.pages.mobile;

import com.automation.pages.interfaces.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageMobile extends BasePageMobile implements HomePage {

        @FindBy(xpath = "//android.widget.TextView[@text=\"Skip\"]\n")
        WebElement skipButton;

        @FindBy(xpath="//android.widget.ImageView[@resource-id=\"com.app.abhibus:id/closeImageView\"]\n")
        WebElement closeLogin;

        @FindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]\n")
        WebElement allowNotification;

        public void openWebsite(){
            skipButton.click();
            closeLogin.click();
            allowNotification.click();
        }

}
