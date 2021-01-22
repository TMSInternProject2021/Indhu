package com.quinbay.automation.Action;

import Pages.EditConnectionPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EditConnectionAction {
    EditConnectionPage editConnectionPage;
    public EditConnectionAction(WebDriver driver) {
        editConnectionPage = PageFactory.initElements(driver, EditConnectionPage.class);
    }

    public void createConnection() throws InterruptedException {
        editConnectionPage.createConnection();
    }

    public void editConnection() throws InterruptedException {
        editConnectionPage.clickOnEditAction();
    }

    public void editFieldsAndSave() throws InterruptedException {
        editConnectionPage.editFields();
    }

    public void verifyConnectionEdited() {
        editConnectionPage.verifyConnectionIsEdited();
    }
}
