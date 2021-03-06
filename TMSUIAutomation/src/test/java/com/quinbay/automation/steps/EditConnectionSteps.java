package com.quinbay.automation.steps;

import com.quinbay.automation.Action.AddNewConnectionAction;
import com.quinbay.automation.Action.EditConnectionAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;

public class EditConnectionSteps {
    EditConnectionAction editAction;
    WebDriver driver;

    @Given("user should be on linehauldetails page")
    public void lineHaulPage(){
        driver = LoginStep.driver;
        editAction=new EditConnectionAction(driver);
    }

    @And("user creates a new connection")
    public void createNewConnection() throws InterruptedException {
        editAction.createConnection();
    }

    @When("user clicks edit icon for particular connection")
    public void clickOnEdit() throws InterruptedException {
        editAction.editConnection();
    }

    @And("user edit the fields and clicks on save")
    public void editFieldsClickOnSave() throws InterruptedException {
        editAction.editFieldsAndSave();
    }

    @Then("validate if the connection has been edited")
    public void editSuccess() {
        editAction.verifyConnectionEdited();
    }



}
