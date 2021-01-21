package com.quinbay.automation.Pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver webDriver){
        driver=webDriver;
    }

    @FindBy(id = "username")
    WebElement username;

    public void enterUserName(String uName) {
        username.sendKeys(uName);
    }

    @FindBy(id = "password")
    WebElement pass;
    public void enterPassword(String password) {
        pass.sendKeys(password);
    }

    @FindBy(xpath="//*[@id=\"loginCard\"]/form/div[4]/input")
    WebElement loginButton;
    public void clickLogin() {
        loginButton.click();
    }

    @FindBy(xpath="//*[@id=\"mount\"]/div/div/div[2]/div/div[2]/div[1]/div/div[3]/button")
    WebElement enterToTMS;
    public void clickOnEnterToTMS() {
        enterToTMS.click();
    }

    @FindBy(xpath="//*[@id=\"mount\"]/div/div/div[2]/div/div/div/div[2]/div/div/span")
    WebElement clickArrow;
    public void selectHubfromDropDown() {
        clickArrow.click();
    }

    @FindBy(xpath = "//*[contains(@class, 'Select-input')]/..")
    WebElement hubSelectorDropDown;

    @FindBy(xpath = "//div[@class='Select-input']//input")
    WebElement hubSelectorInput;

    public void selectHub(String hub) {
        try {
            hubSelectorDropDown.click();
            hubSelectorInput.sendKeys(hub);
            hubSelectorInput.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            throw new RuntimeException("Unable to select hub from dropdown", e);
        }
    }

    @FindBy(xpath = "//*[@id=\"mount\"]/div/div/div[1]/div/div[1]/div[2]/ul/li[7]/a/span[2]")
    WebElement settings;
    public void clickSettings() {
        settings.click();
    }

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div[2]/ul/li[15]")
    WebElement linehaul;
    public void clickLinehaul() {
        linehaul.click();
    }

    @FindBy(xpath = "//div//button[@class='default-button pull-right marigin-top10 btn']")
    WebElement clickAdd;
    public void ClickOnAdd() {
        clickAdd.click();
    }

    @FindBy(xpath = "//input[@class='input-box-style input dropdown large']")
    WebElement clickOriginHub;
    public void selectOriginHub(String originHub) {
        clickOriginHub.sendKeys(originHub);
    }

    @FindBy(xpath = "(//div//div[@class='option'])[3]")
    WebElement chooseOrigin;
    public void ChooseOriginHub() {
        chooseOrigin.click();
    }


    @FindBy(xpath = "(//div//input[@class='input-box-style input dropdown large'])[2]")
    WebElement clickDestHub;
    public void selectDestHub(String destHub) {
        clickDestHub.sendKeys(destHub);
    }

    @FindBy(xpath = "//div//div[@class='option']")
    WebElement chooseDest;
    public void ChooseDestHub() {
        chooseDest.click();
    }

    @FindBy(xpath = "//div//input[@class='form-control']")
    WebElement date;
    public void clickOnDateField() {
        date.click();
    }

    @FindBy(xpath = "//div//div[@class='DayPicker-Day'][2]")
    WebElement chooseDate;
    public void ChooseDateFromCalendar() {
        chooseDate.click();
    }

    @FindBy(xpath = "//div//div//div//input[@class='input-box-style dropdown']")
    WebElement repeat;
    public void clickOnRepeatField() {
        repeat.click();
    }

    @FindBy(xpath = "//div//div//div[@class='option'][2]")
    WebElement chooseFrequency;
    public void ChooseRepeatFrequency() {
        chooseFrequency.click();
    }

    @FindBy(xpath = "(//div//input[@class='input-box-style input'])")
    WebElement startTime;
    public void EnterStartTime(String stTime) {
        startTime.sendKeys(stTime);
    }

    @FindBy(xpath = "(//div//input[@class='input-box-style input'])[2]")
    WebElement transitTime;
    public void EnterTransitTime(String trTime) {
        transitTime.sendKeys(trTime);
    }

    @FindBy(xpath = "(//div//input[@class='input-box-style input dropdown large'])[3]")
    WebElement vehicleType;
    public void ClickOnVehicleTypefield(){
        vehicleType.click();
    }

    @FindBy(xpath = "(//div//div[@class='option'])[4]")
    WebElement choosevehicle;
    public void chooseVehicleType() {
        choosevehicle.click();
    }

    @FindBy(xpath = "//div//div//button[contains(text(),'Save')]")
    WebElement save;
    public void ClickOnSave() {
        save.click();
    }

    @FindBy(xpath="(//div//div//span//img[@class='icon'])[2]")
    WebElement edit;
    public void clickOnEditAction() {
        edit.click();
    }

    @FindBy(xpath = "//div//div//span[contains(text(),'Monday')]")
    WebElement editRepeat1;

    @FindBy(xpath = "//div//div//span[contains(text(),'Thursday')]")
    WebElement editRepeat2;

    public void editConnection() {
        repeat.click();
        editRepeat1.click();
        editRepeat2.click();
    }

    public void saveEditedConnection() throws InterruptedException {
        save.click();
        Thread.sleep(1000);
    }

    //Sort by origin hub
    @FindBy(xpath = "//div//div//table//span[@class='icon-down-arrow up']")
    WebElement sortAscending;

    @FindBy(xpath = "//div//div//table//span[@class='icon-down-arrow down']")
    WebElement sortDescending;

    public void sortByOriginHub() throws InterruptedException {
        sortAscending.click();
        Thread.sleep(1000);
        sortDescending.click();
    }


}
