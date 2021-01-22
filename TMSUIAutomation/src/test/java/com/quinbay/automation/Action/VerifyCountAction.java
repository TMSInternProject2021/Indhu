package com.quinbay.automation.Action;

import Pages.VerifyCountPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class VerifyCountAction {
    public VerifyCountPage verifyCountPage;
    public VerifyCountAction(WebDriver driver) {
        verifyCountPage = PageFactory.initElements(driver, VerifyCountPage.class);
    }

    public void performSearch() throws InterruptedException {
        verifyCountPage.performSearch();
    }

    public void countNoOfEntries() {
        verifyCountPage.countConnectionList();
    }

    public void countDisplayedAtPageEnd() {
        verifyCountPage.countDisplayedAtEnd();
    }

    public boolean validateBothCountAreEqual() {
        return verifyCountPage.check();
    }
}
