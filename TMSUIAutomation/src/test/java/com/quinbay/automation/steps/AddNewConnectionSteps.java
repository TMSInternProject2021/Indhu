package com.quinbay.automation.steps;

import com.quinbay.automation.Action.AddNewConnectionAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;

public class AddNewConnectionSteps {
    AddNewConnectionAction addAction;
    WebDriver driver;

    @Given("user should be on linehaul details page")
    public void linehaulDetailsPage() {
        driver = LoginStep.driver;
        addAction=new AddNewConnectionAction(driver);
    }

    @When("user clicks add new connection")
    public void clickOnAddNewConnection() {
        addAction.clickOnAdd();
    }

    @And("user fills all details to create an new connection and clicks on save")
    public void fillTheDetails() throws InterruptedException {
        addAction.fillDetails();
    }

    @Then("validate if new connection is created")
    public void connectionCreated() {
        assertThat("New Connection Not created",addAction.verifyConnectionIsSuccessful());
    }

}
