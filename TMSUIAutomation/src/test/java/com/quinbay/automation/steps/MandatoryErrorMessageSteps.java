package com.quinbay.automation.steps;

import com.quinbay.automation.Action.MandatoryErrorMessageAction;
import com.quinbay.automation.Action.VerifyCountAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MandatoryErrorMessageSteps {
    MandatoryErrorMessageAction errorMessageAction;
    WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Given("User should be on Add new connection pop-up")
    public void addNewConnectionPopUpPage() {
        driver = LoginStep.driver;
        errorMessageAction=new MandatoryErrorMessageAction(driver);
        errorMessageAction.clickAdd();
        System.out.println("Add new connection...");
    }

    @When("user enters invalid data and clicks on save")
    public void enterInvalidData() throws InterruptedException {
        errorMessageAction.enterInvalidData();
    }

    @Then("mandatory error message is thrown")
    public void errorMessageThrown() {
        System.out.println("Mandatory Error Message Thrown");
    }

}
