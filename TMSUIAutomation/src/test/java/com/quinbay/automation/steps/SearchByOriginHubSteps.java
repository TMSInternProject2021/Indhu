package com.quinbay.automation.steps;

import com.quinbay.automation.Action.SearchByOriginHubAction;
import com.quinbay.automation.Action.SortByOriginHubAction;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class SearchByOriginHubSteps {
    SearchByOriginHubAction searchAction;
    WebDriver driver;

    @Given("user lands on linehaul details page")
    public void lineHaulPage(){
        driver = LoginStep.driver;
        searchAction=new SearchByOriginHubAction(driver);
        System.out.println("Search Connection");
    }

    @When("user clicks on Origin hub")
    public void clickOnOriginHub() {
        searchAction.ClickOnOriginHub();
    }

    @And("choose the hub to be searched")
    public void chooseHubToBeSearched() {
        searchAction.chooseHubForSearch();
    }

    @Then("user should be able to see the search results")
    public void SearchResultsFound() {
        System.out.println("Search Results are found");
    }
}
