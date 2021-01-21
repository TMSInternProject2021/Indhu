package com.quinbay.automation.steps;

import com.quinbay.automation.Action.AddNewConnectionAction;
import com.quinbay.automation.Action.LoginActions;
import com.quinbay.automation.Action.VerifyCountAction;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.util.concurrent.TimeUnit.SECONDS;

public class VerifyCountSteps {
    VerifyCountAction verifyCountAction;
    WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Given("user should be on linehaul detail page")
    public void linehaulDetailsPage() {
        driver = LoginStep.driver;
        verifyCountAction=new VerifyCountAction(driver);
        System.out.println("Linehaul details page...");
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
