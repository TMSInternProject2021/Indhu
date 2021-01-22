package com.quinbay.automation.steps;

import com.quinbay.automation.Action.VerifyCountAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class VerifyCountSteps {
    VerifyCountAction verifyCountAction;
    WebDriver driver;

    @Given("user should be on linehaul detail page")
    public void linehaulDetailsPage() {
        driver = LoginStep.driver;
        verifyCountAction=new VerifyCountAction(driver);
    }

    @And("search operation is performed")
    public void performSearch() throws InterruptedException {
        verifyCountAction.performSearch();
    }

   @When("user counts number of entries")
    public void countList() {
        verifyCountAction.countNoOfEntries();
    }

    @And("total count is displayed")
    public void countDisplayedAtEndOfPage() {
        verifyCountAction.countDisplayedAtPageEnd();
    }

    @Then("validate if both page count and data count are equal")
    public void validateDataAndTotalCountAreEqual() {
        verifyCountAction.validateBothCountAreEqual();
    }




}
