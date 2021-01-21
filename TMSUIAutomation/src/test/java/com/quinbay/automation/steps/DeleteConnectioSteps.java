package com.quinbay.automation.steps;

import com.quinbay.automation.Action.DeleteConnectionAction;
import com.quinbay.automation.Action.EditConnectionAction;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class DeleteConnectioSteps {
    DeleteConnectionAction deleteAction;
    WebDriver driver;

    @Given("user should be on Linehaul details page")
    public void lineHaulPage(){
        driver = LoginStep.driver;
        deleteAction=new DeleteConnectionAction(driver);
        System.out.println("Delete Connection");
    }

    @And("user creates new connection")
    public void createNewConnection() throws InterruptedException {
        deleteAction.createConnection();
    }
    @When("user clicks delete icon for connection created")
    public void clickOnDelete() {
        deleteAction.ClickOnDelete();
    }

    @Then("validate if the connection has been deleted")
    public void deleteSuccess() {
        System.out.println("Connection deleted successfully");
    }
}
