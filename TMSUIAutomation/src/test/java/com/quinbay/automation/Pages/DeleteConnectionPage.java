package com.quinbay.automation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteConnectionPage {

    WebDriver driver;
    public DeleteConnectionPage(WebDriver webDriver){
        driver=webDriver;
    }

    @FindBy(xpath = "(//div//div//table//span//img[@class='icon margin-l10'])[2]")
    WebElement delete;
    public void clickDelete() {
        delete.click();
    }
}
