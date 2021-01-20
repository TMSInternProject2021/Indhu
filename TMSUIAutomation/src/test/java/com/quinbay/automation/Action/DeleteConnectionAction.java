package com.quinbay.automation.Action;

import com.quinbay.automation.Pages.DeleteConnectionPage;
import com.quinbay.automation.Pages.EditConnectionPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DeleteConnectionAction {
    DeleteConnectionPage deleteConnectionPage;
    public DeleteConnectionAction(WebDriver driver) {
        deleteConnectionPage = PageFactory.initElements(driver, DeleteConnectionPage.class);
    }

    public void ClickOnDelete() {
        deleteConnectionPage.clickDelete();
    }
}
