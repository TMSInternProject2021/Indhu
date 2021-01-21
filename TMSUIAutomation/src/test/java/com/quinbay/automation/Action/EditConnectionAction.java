package com.quinbay.automation.Action;

import com.quinbay.automation.Pages.AddNewConnectionPage;
import com.quinbay.automation.Pages.EditConnectionPage;
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

    public void editConnection() {
        editConnectionPage.clickOnEditAction();
    }

    public void editFieldsAndSave() throws InterruptedException {
        editConnectionPage.editFields();
    }
}
