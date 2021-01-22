package com.quinbay.automation.Action;

import Pages.SearchByOriginHubPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchByOriginHubAction {
    SearchByOriginHubPage searchConnectionPage;
    public SearchByOriginHubAction(WebDriver driver) {
        searchConnectionPage = PageFactory.initElements(driver, SearchByOriginHubPage.class);
    }

    public void clickOnOriginHub() {
        searchConnectionPage.clickOnOriginHubToSearch();
    }

    public void chooseHubForSearch() {
        searchConnectionPage.chooseHubThatNeedsToBeSearched();
    }

    public boolean verifySearchResults() {
       return searchConnectionPage.verifySearchByOriginHubIsPerformed();
    }
}
