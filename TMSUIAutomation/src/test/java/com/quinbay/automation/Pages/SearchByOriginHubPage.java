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

    @FindBy(xpath = "(//div//div//label[contains(text(),'TMS Hub')])")
    WebElement chooseHub;
    public void chooseHubThatNeedsToBeSearched() {
        chooseHub.click();
    }

}
