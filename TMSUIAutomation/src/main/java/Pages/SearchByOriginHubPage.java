package com.quinbay.automation.Pages;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchByOriginHubPage {

    WebDriver driver;
    public SearchByOriginHubPage(WebDriver webDriver){
        driver=webDriver;
    }
    @FindBy(xpath = "//div//div//table//span//label[@class='clickable']")
    WebElement search;
    public void ClickOnOriginHubToSearch() {
        search.click();
    }

    @FindBy(xpath = "(//div//div//label[contains(text(),'Ceper Hub')])")
    WebElement chooseHub;

    @FindBy(xpath = "//div//div[@class='margin-b10']")
    WebElement clickTab;
    public void chooseHubThatNeedsToBeSearched() {
        chooseHub.click();
        clickTab.click();
    }

}
//div//div[@class='margin-b10']