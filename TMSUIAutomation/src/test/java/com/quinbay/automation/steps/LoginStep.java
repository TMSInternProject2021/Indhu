package com.quinbay.automation.steps;

import com.quinbay.automation.Action.LoginActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.util.concurrent.TimeUnit.SECONDS;

public class LoginStep {
    public static WebDriver driver;
    LoginActions loginAction;

    @Given("user with valid login credentials")
    public void login() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, SECONDS);
        driver.get("http://tmsuiapp-01.uata.lokal/tms-ui/");
        loginAction=new LoginActions(driver);

    }

    @When("user logins into tms application")
    public void loginToTms() throws InterruptedException {
        loginAction.loginWithData();
    }

    @And("user enters to tms")
    public void clickEnterToTms() throws InterruptedException {
        loginAction.enterToTMS();
    }

    @And("user selects hub")
    public void selectHub() {
       loginAction.selectHub();
    }

    @Then("user lands on TMS dashboard page")
    public void dashboardPage() {
       loginAction.verifyDashboardPage();
    }

    @And("user selects settings and moves to linehaul details page")
    public void selectSettingsAndChooseLineHaulDetails() throws InterruptedException {
        loginAction.clickOnSettings();
        loginAction.verifyLinehaulDetailsPage();
    }

}
