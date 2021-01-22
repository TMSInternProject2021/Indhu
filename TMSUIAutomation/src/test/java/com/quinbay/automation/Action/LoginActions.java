package com.quinbay.automation.Action;

import Pages.LoginPages;
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

    public void enterToTMS() throws InterruptedException {
        loginPage.clickOnEnterToTMS();
    }

    public void selectHub() {
        loginPage.selectHub();
    }

    public boolean verifyDashboardPage() {
        return loginPage.verifyDashboardPage();
    }
    public void clickOnSettings() throws InterruptedException {
        loginPage.clickSettings();
    }


    public boolean verifyLinehaulDetailsPage() {
        return loginPage.verifyLinehaulDetailsPage();
    }
}
