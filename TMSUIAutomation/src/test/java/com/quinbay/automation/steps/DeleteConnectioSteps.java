package com.quinbay.automation.steps;

import com.quinbay.automation.Action.DeleteConnectionAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;

public class DeleteConnectioSteps {
    DeleteConnectionAction deleteAction;
    WebDriver driver;

    @Given("user should be on Linehaul details page")
    public void lineHaulPage(){
        driver = LoginStep.driver;
        deleteAction=new DeleteConnectionAction(driver);
    }

    @And("user creates new connection")
    public void createNewConnection() throws InterruptedException {
        deleteAction.createConnection();
    }
    @When("user clicks delete icon for connection created")
    public void clickOnDelete() {
        deleteAction.clickOnDelete();
    }

    @Then("validate if the connection has been deleted")
    public void deleteSuccess() {
       deleteAction.verifyConnectionDeleted();
    }
}
