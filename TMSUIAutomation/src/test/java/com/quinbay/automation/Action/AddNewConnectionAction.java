package com.quinbay.automation.Action;

import Pages.AddNewConnectionPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddNewConnectionAction {
    AddNewConnectionPage connectionPage;
    public AddNewConnectionAction(WebDriver driver) {
         connectionPage = PageFactory.initElements(driver, AddNewConnectionPage.class);
    }

    public void clickOnAdd() {
        connectionPage.clickOnAdd();
    }


    public void fillDetails() throws InterruptedException {
        connectionPage.fillAllFields();
    }

    public void verifyConnectionIsSuccessful() {
        connectionPage.verifyConnectionCreated();
    }
}
