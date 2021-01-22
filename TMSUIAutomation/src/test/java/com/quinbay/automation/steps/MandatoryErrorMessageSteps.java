package com.quinbay.automation.steps;

import com.quinbay.automation.Action.MandatoryErrorMessageAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;

public class MandatoryErrorMessageSteps {
    MandatoryErrorMessageAction errorMessageAction;
    WebDriver driver;

    @Given("user should be on Add new connection pop-up")
    public void addNewConnectionPopUpPage() {
        driver = LoginStep.driver;
        errorMessageAction=new MandatoryErrorMessageAction(driver);
        errorMessageAction.clickAdd();
    }

    @When("user enters invalid data and clicks on save")
    public void enterInvalidData() throws InterruptedException {
        errorMessageAction.enterInvalidData();
    }

    @Then("mandatory error message is thrown")
    public void errorMessageThrown() {
        assertThat("Mandatory error message is thrown",errorMessageAction.verifyErrorMessageIsThrown());
    }

}
