package com.quinbay.automation.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static java.util.concurrent.TimeUnit.SECONDS;

public class LoginPages {

    WebDriver driver;

    public LoginPages(WebDriver webDriver){
        driver=webDriver;
    }

    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement pass;

    @FindBy(xpath="//*[@id=\"loginCard\"]/form/div[4]/input")
    WebElement loginButton;

    public void loginToTMS() throws InterruptedException {
        username.sendKeys("tmsadmin");
        pass.sendKeys("Test@2020");
       // driver.manage().timeouts().implicitlyWait(1000, SECONDS);
        Thread.sleep(100);
        loginButton.click();
        //driver.manage().timeouts().implicitlyWait(1000, SECONDS);

    }

    @FindBy(xpath="//*[@id=\"mount\"]/div/div/div[2]/div/div[2]/div[1]/div/div[3]/button")
    WebElement enterToTMS;
    public void clickOnEnterToTMS() {
        enterToTMS.click();
        driver.manage().timeouts().implicitlyWait(1000, SECONDS);

    }

    @FindBy(xpath="//*[@id=\"mount\"]/div/div/div[2]/div/div/div/div[2]/div/div/span")
    WebElement clickArrow;

    @FindBy(xpath = "//*[contains(@class, 'Select-input')]/..")
    WebElement hubSelectorDropDown;

    @FindBy(xpath = "//div[@class='Select-input']//input")
    WebElement hubSelectorInput;

    public void selectHub() {
        clickArrow.click();
        try {
            hubSelectorDropDown.click();
            hubSelectorInput.sendKeys("TMS Hub");
            hubSelectorInput.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            throw new RuntimeException("Unable to select hub from dropdown", e);
        }
    }

    @FindBy(xpath = "//*[@id=\"mount\"]/div/div/div[1]/div/div[1]/div[2]/ul/li[7]/a/span[2]")
    WebElement settings;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div[2]/ul/li[15]")
    WebElement linehaul;

    public void clickSettings() {
        settings.click();
        driver.manage().timeouts().implicitlyWait(1000, SECONDS);
        linehaul.click();
    }


}
