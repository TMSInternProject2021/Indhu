package com.quinbay.automation.Action;

import Pages.MandatoryErrorMessagePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MandatoryErrorMessageAction {
    public MandatoryErrorMessagePages errorMessagePages;
    public MandatoryErrorMessageAction(WebDriver driver) {
        errorMessagePages = PageFactory.initElements(driver, MandatoryErrorMessagePages.class);
    }

    public void clickAdd() {
        errorMessagePages.clickOnAdd();
    }

    public void enterInvalidData() throws InterruptedException {
        errorMessagePages.invalidData();
    }

    public boolean verifyErrorMessageIsThrown() {
       return errorMessagePages.verifyMandatoryErrorMessageIsThrown();
    }
}
