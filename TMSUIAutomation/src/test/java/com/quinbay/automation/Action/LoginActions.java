package com.quinbay.automation.Action;

import com.quinbay.automation.Pages.LoginPage;
import com.quinbay.automation.Pages.LoginPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginActions {
    public LoginPages loginPage;

    public LoginActions(WebDriver driver) {
        loginPage = PageFactory.initElements(driver, LoginPages.class);
    }

    public void loginWithData() throws InterruptedException {
        loginPage.loginToTMS();
    }

    public void enterToTMS() {
        loginPage.clickOnEnterToTMS();
    }

    public void selectHub() {
        loginPage.selectHub();
    }

    public void ClickOnSettings() {
        loginPage.clickSettings();
    }


}
