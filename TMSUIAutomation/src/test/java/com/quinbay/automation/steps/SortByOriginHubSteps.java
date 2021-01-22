package com.quinbay.automation.steps;

import com.quinbay.automation.Action.SortByOriginHubAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;

public class SortByOriginHubSteps {
    SortByOriginHubAction sortAction;
    WebDriver driver;

    @Given("user lands be on linehaul details page")
    public void lineHaulPage(){
        driver = LoginStep.driver;
        sortAction=new SortByOriginHubAction(driver);
    }

    @When("user click on origin hub downarrow")
    public void clickOnDownArrow() throws InterruptedException {
        sortAction.clickOnDownArrowToSort();
    }

    @Then("user should be able to see the connection list sorted in descending order")
    public void sortResults() {
        assertThat("Connection is not sorted",sortAction.verifySort());
    }
}
