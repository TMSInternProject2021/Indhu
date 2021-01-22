package com.quinbay.automation.Action;

import Pages.DeleteConnectionPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DeleteConnectionAction {
    DeleteConnectionPage deleteConnectionPage;
    public DeleteConnectionAction(WebDriver driver) {
        deleteConnectionPage = PageFactory.initElements(driver, DeleteConnectionPage.class);
    }

    public void createConnection() throws InterruptedException {
        deleteConnectionPage.createNewConnection();
    }
    public void clickOnDelete() {
        deleteConnectionPage.clickDelete();
    }

    public void verifyConnectionDeleted() {
         deleteConnectionPage.verifyConnectionIsDeleted();
    }
}
