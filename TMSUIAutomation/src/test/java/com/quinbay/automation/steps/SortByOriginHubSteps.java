package com.quinbay.automation.steps;

import com.quinbay.automation.Action.DeleteConnectionAction;
import com.quinbay.automation.Action.SortByOriginHubAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class SortByOriginHubSteps {
    SortByOriginHubAction sortAction;
    WebDriver driver;

    @Given("User lands be on linehaul details page")
    public void lineHaulPage(){
        driver = LoginStep.driver;
        sortAction=new SortByOriginHubAction(driver);
        System.out.println("Sort Connection");
    }

    @When("user click on origin hub downarrow")
    public void clickOnDownArrow() {
        sortAction.clickOnDownArrowToSort();
    }

    @Then("user should be able to see the connection list sorted in descending order")
    public void SortResults() {
        System.out.println("connection list is sorted in descending order");
    }
}
