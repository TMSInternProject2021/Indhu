package com.quinbay.automation.Action;

import Pages.SortByOriginHubPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SortByOriginHubAction {

    SortByOriginHubPage sortConnectionPage;
    public SortByOriginHubAction(WebDriver driver) {
        sortConnectionPage = PageFactory.initElements(driver, SortByOriginHubPage.class);
    }

    public void clickOnDownArrowToSort() throws InterruptedException {
        sortConnectionPage.clickDownArrowToSort();
    }

    public boolean verifySort() {
        return sortConnectionPage.verifySortByOriginHubInDescendingOrderIsPerformed();
    }
}
