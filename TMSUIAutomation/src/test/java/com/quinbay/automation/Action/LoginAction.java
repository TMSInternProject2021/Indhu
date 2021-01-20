package com.quinbay.automation.Action;

import com.quinbay.automation.Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginAction {
    public LoginPage loginPage;

    public LoginAction(WebDriver driver) {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    public void UserName(String uname) {
        loginPage.enterUserName(uname);
    }

    public void Password(String pass)
    {
        loginPage.enterPassword(pass);
    }

    public void clickOnLogin()
    {
        loginPage.clickLogin();
    }

    public void clickEnterToTMS() {
        loginPage.clickOnEnterToTMS();
    }

    public void hubSelector(String hub) {
        loginPage.selectHub(hub);
    }

    public void ChooseSettings() {
        loginPage.clickSettings();
    }
    public void chooseLinehaul() {
        loginPage.clickLinehaul();
    }

    public void clickOnAdd() {
        loginPage.ClickOnAdd();
    }

    public void EnterOriginHub(String originHub) {
        loginPage.selectOriginHub(originHub);
    }

    public void chooseOriHub() {
        loginPage.ChooseOriginHub();
    }

    public void EnterDestHub(String destHub) {
        loginPage.selectDestHub(destHub);
    }

    public void chooseDestHub() {
        loginPage.ChooseDestHub();
    }

    public void clickDateField() {
        loginPage.clickOnDateField();
    }

    public void PickDateFromCalendar() {
        loginPage.ChooseDateFromCalendar();
    }

    public void clickRepeatField() {
        loginPage.clickOnRepeatField();
    }

    public void chooseFrequencyFromDropdown() {
        loginPage.ChooseRepeatFrequency();
    }

    public void EnterStartTime(String sttime) {
        loginPage.EnterStartTime(sttime);
    }

    public void EnterTransitTime(String trtime) {
        loginPage.EnterTransitTime(trtime);
    }

    public void ClickOnVehicleType() {
        loginPage.ClickOnVehicleTypefield();

    }

    public void SelectVehicleType() {
        loginPage.chooseVehicleType();
    }

    public void ClickSave() {
        loginPage.ClickOnSave();
    }

    //Edit Connection
    public void ClickOnEdit() {
        loginPage.clickOnEditAction();
    }

    public void editRepeatFrequency() {
        loginPage.editConnection();
    }
    public void saveEdited() throws InterruptedException {
        loginPage.saveEditedConnection();
    }

    //Sort by origin hub
    public void sort() throws InterruptedException {
        loginPage.sortByOriginHub();
    }

}
