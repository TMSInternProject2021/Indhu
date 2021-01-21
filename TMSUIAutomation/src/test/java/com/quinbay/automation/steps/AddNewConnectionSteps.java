package com.quinbay.automation.steps;

import com.quinbay.automation.Action.AddNewConnectionAction;
import com.quinbay.automation.Action.LoginActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AddNewConnectionSteps {
    AddNewConnectionAction addAction;
    WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Given("User should be on linehaul details page")
    public void linehaulDetailsPage() {
        driver = LoginStep.driver;
        addAction=new AddNewConnectionAction(driver);
        System.out.println("Linehaul details page...");
    }



    @When("user clicks add new connection")
    public void clickOnAddNewConnection() {
        addAction.clickOnAdd();
    }

    @And("user fills all details to create an new connection and clicks on save")
    public void FilltheDetails() throws InterruptedException {
        addAction.FillDetails();
    }

    @Then("validate if new connection is created")
    public void ConnectionCreated() {
        System.out.println("ConnectionCreated...");
    }

}
