package com.quinbay.automation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MandatoryErrorMessagePages {
    WebDriver driver;

    public MandatoryErrorMessagePages(WebDriver webDriver){
        driver=webDriver;
    }

    @FindBy(xpath = "//div//button[@class='default-button pull-right marigin-top10 btn']")
    WebElement clickAdd;
    public void ClickOnAdd() {
        clickAdd.click();
    }

    @FindBy(xpath = "//input[@class='input-box-style input dropdown large']")
    WebElement clickOriginHub;

    @FindBy(xpath = "//div//div//input[@class='input-box-style input dropdown large']")
    WebElement clickDestHub;

    public void InvalidData() throws InterruptedException {
        clickOriginHub.sendKeys("cbe");
        Thread.sleep(100);
        clickDestHub.sendKeys("sal");
    }

}
