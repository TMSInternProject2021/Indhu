package com.quinbay.automation.Action;

import com.quinbay.automation.Pages.AddNewConnectionPage;
import com.quinbay.automation.Pages.LoginPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddNewConnectionAction {
    AddNewConnectionPage connectionPage;
    public AddNewConnectionAction(WebDriver driver) {
         connectionPage = PageFactory.initElements(driver, AddNewConnectionPage.class);
    }

    public void clickOnAdd() {
        connectionPage.ClickOnAdd();
    }


    public void FillDetails() throws InterruptedException {
        connectionPage.FillAllFields();
    }
}
