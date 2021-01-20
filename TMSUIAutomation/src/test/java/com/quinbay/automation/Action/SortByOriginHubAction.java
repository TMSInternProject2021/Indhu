package com.quinbay.automation.Action;

import com.quinbay.automation.Pages.SortByOriginHubPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SortByOriginHubAction {

    SortByOriginHubPage sortConnectionPage;
    public SortByOriginHubAction(WebDriver driver) {
        sortConnectionPage = PageFactory.initElements(driver, SortByOriginHubPage.class);
    }

    public void clickOnDownArrowToSort() {
        sortConnectionPage.ClickDownArrowToSort();
    }
}
