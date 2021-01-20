package com.quinbay.automation.Action;

import com.quinbay.automation.Pages.SearchByOriginHubPage;
import com.quinbay.automation.Pages.SortByOriginHubPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchByOriginHubAction {
    SearchByOriginHubPage searchConnectionPage;
    public SearchByOriginHubAction(WebDriver driver) {
        searchConnectionPage = PageFactory.initElements(driver, SearchByOriginHubPage.class);
    }

    public void ClickOnOriginHub() {
        searchConnectionPage.ClickOnOriginHubToSearch();
    }

    public void chooseHubForSearch() {
        searchConnectionPage.chooseHubThatNeedsToBeSearched();
    }
}
