package com.quinbay.automation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditConnectionPage {
    WebDriver driver;

    public EditConnectionPage(WebDriver webDriver){
        driver=webDriver;
    }

    @FindBy(xpath="(//div//div//span//img[@class='icon'])[2]")
    WebElement edit;
    public void clickOnEditAction() {
        edit.click();
    }

    @FindBy(xpath = "//div//div//div//input[@class='input-box-style dropdown']")
    WebElement repeat;

    @FindBy(xpath = "//div//div//span[contains(text(),'Monday')]")
    WebElement editRepeat1;

    @FindBy(xpath = "//div//div//span[contains(text(),'Thursday')]")
    WebElement editRepeat2;

    @FindBy(xpath = "//div//div//button[contains(text(),'Save')]")
    WebElement save;

    public void editFields() throws InterruptedException {
        repeat.click();
        editRepeat1.click();
        editRepeat2.click();
        save.click();
        Thread.sleep(1000);
    }




}
