package com.quinbay.automation.steps;

import com.quinbay.automation.Action.LoginAction;
import com.quinbay.automation.Action.LoginActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.util.concurrent.TimeUnit.SECONDS;

public class LoginStep {
    public static WebDriver driver;
    LoginActions loginAction;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Given("User with valid login credentials")
    public void login() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, SECONDS);
        driver.get("http://tmsuiapp-01.uata.lokal/tms-ui/");
        System.out.println("Login page");
        loginAction=new LoginActions(driver);

    }

    @When("user logs into tms application")
    public void loginToTms() throws InterruptedException {
        loginAction.loginWithData();
    }

    @And("user enters to tms")
    public void clickEnterToTms() {
        loginAction.enterToTMS();
    }

    @And("user selects hub")
    public void selectHub() {
       loginAction.selectHub();
    }

    @Then("user lands on TMS home page")
    public void homePage() {
        System.out.println("Home page");
    }

    @And("user selects settings and moves to linehaul details page")
    public void selectSettings() {
        loginAction.ClickOnSettings();
    }

}
