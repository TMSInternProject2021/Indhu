package com.quinbay.automation.Action;

import com.quinbay.automation.Pages.MandatoryErrorMessagePages;
import com.quinbay.automation.Pages.VerifyCountPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MandatoryErrorMessageAction {
    public MandatoryErrorMessagePages errorMessagePages;
    public MandatoryErrorMessageAction(WebDriver driver) {
        errorMessagePages = PageFactory.initElements(driver, MandatoryErrorMessagePages.class);
    }

    public void clickAdd() {
        errorMessagePages.ClickOnAdd();
    }

    public void enterInvalidData() throws InterruptedException {
        errorMessagePages.InvalidData();
    }
}
