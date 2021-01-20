package com.quinbay.automation.steps;

import com.quinbay.automation.Action.DeleteConnectionAction;
import com.quinbay.automation.Action.EditConnectionAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class DeleteConnectioSteps {
    DeleteConnectionAction deleteAction;
    WebDriver driver;

    @Given("User should be on Linehaul details page")
    public void lineHaulPage(){
        driver = LoginStep.driver;
        deleteAction=new DeleteConnectionAction(driver);
        System.out.println("Delete Connection");
    }

    @When("user clicks delete icon for particular connection")
    public void clickOnDelete() {
        deleteAction.ClickOnDelete();
    }

    @Then("validate if the connection has been deleted")
    public void deleteSuccess() {
        System.out.println("Connection deleted successfully");
    }
}
