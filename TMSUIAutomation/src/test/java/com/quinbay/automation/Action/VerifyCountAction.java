package com.quinbay.automation.Action;

import com.quinbay.automation.Pages.LoginPages;
import com.quinbay.automation.Pages.VerifyCountPage;
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
        verifyCountPage.CountDisplayedAtEnd();
    }

    public void validateBothCountAreEqual() {
        verifyCountPage.check();
    }
}
