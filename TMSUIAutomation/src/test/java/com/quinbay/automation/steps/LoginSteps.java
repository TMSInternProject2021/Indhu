package com.quinbay.automation.steps;

import com.quinbay.automation.Action.LoginAction;
import com.quinbay.automation.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_lol.AN;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static java.util.concurrent.TimeUnit.SECONDS;

public class LoginSteps {
    public static WebDriver driver;
    LoginAction loginAction;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Given("I am on TMS Login page")
    public void tmsHomePage() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, SECONDS);
        driver.get("http://tmsuiapp-01.uata.lokal/tms-ui/");
        System.out.println("Login page");
        loginAction=new LoginAction(driver);
    }
    @When("I enter username as {string}")
    public void enterUserName(String userName) {
        loginAction.UserName(userName);
    }

    @And("I enter password as {string}")
    public void enterPassword(String password) {
        loginAction.Password(password);
    }

    @And("I click on Login")
    public void hitLogin() throws InterruptedException {
        loginAction.clickOnLogin();
        Thread.sleep(1000);
    }

    @Then("I am on Application selector page")
    public void homePage() {
        System.out.println("Application selector page displayed");
    }

    @When("I click on Enter to TMS")
    public void enterToTMS() throws InterruptedException {
        loginAction.clickEnterToTMS();
        Thread.sleep(100);
    }
    @Then("Hub selector page is displayed")
    public void hubPage() {
        System.out.println("Hub selector page is displayed");
    }


    /*@And("I enter as {string}")
    public void passHubvalue(String hub) {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000)");
        WebElement enterhub = driver.findElement(By.xpath("//span[@id='react-select-17--value']/div"));

        enterhub.click();
    }*/

    @When("choose HUB NAME as {string}")
    public void chooseHub(String hub) {
        loginAction.hubSelector(hub);
        System.out.println("");
    }

   /* @And("I choose as TMS hub")
    public void tmsHub(){
        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"mount\"]/div/div/div[2]/div/div/div/div[2]/div/div/span"));
        WebElement choose = driver.findElement(By.xpath("//*[@id=\"mount\"]/div/div/div[2]/div/div[2]/div[1]/div/div[3]/button"));
        dropdown.click();
    }*/
    //*[@id="react-select-3--value"]/div[1]
    //*[@id="react-select-3--value"]/div[2]/input
    //*[@id="mount"]/div/div/div[2]/div/div/div/div[2]/div
    //*[@id="mount"]/div/div/div[2]/div/div/div/div[2]/div/div/span
    //*[@id="react-select-7--value-item"]

    @And("I click on settings")
    public void clickSettings() throws InterruptedException {
        loginAction.ChooseSettings();
        Thread.sleep(1000);
    }

    @Then("Navigates to settings page")
    public void settingsPage() {
        System.out.println("Settings page");
    }

    @When("I choose linehaul details from settings")
    public void chooseLinehaul() throws InterruptedException {
        loginAction.chooseLinehaul();
        Thread.sleep(1000);
    }

    @Then("I am on Linehaul details page")
    public void linehaulPage() {
        System.out.println("Linehaul details page");
    }

    @When("I click on Add new connection")
    public void clickAddNewConnection() {
        loginAction.clickOnAdd();
        System.out.println("Add new connection button is clicked");
    }

    @Then("Add new connection pop-up displayed")
    public void addPopup() {
        System.out.println("Add new connection pop-up displayed");
    }

    @When("I pass hubname as {string} to Origin Hub field")
    public void OriginHubName(String originName){
        loginAction.EnterOriginHub(originName);
    }

    @And("I choose {string} from drop-down of Origin hub field")
    public void chooseOriginHub(String ori_Name) {
        loginAction.chooseOriHub();
        System.out.println("Origin hub field is filled with value :" + ori_Name);
    }

    @When("I pass hubname as {string} to Destination Hub field")
    public void DestHubName(String destName){
        loginAction.EnterDestHub(destName);
    }

    @And("I choose {string} from drop-down of Destination hub field")
    public void chooseDestHub(String dest_Name) throws InterruptedException {
        loginAction.chooseDestHub();
        System.out.println("Destination hub field is filled with value :" + dest_Name);
        Thread.sleep(1000);
    }

    @When("I click on DateField")
    public void clickOnDate() {
        loginAction.clickDateField();
    }

    @And("I choose date as {string}")
    public void chooseDate(String date) {
        loginAction.PickDateFromCalendar();
        System.out.println("Date chose from calendar :"+ date);
    }

    @When("I click on Repeat frequency field")
    public void clickOnRepeat() {
        loginAction.clickRepeatField();
    }

    @And("I choose {string} from drop-down")
    public void chooseRepeatFrequency(String freq) {
        loginAction.chooseFrequencyFromDropdown();
        System.out.println("Repeat Frequency chosen :"+ freq);
    }

    @When("I enter Start Time as {string}")
    public void startTimeField(String time) {
        loginAction.EnterStartTime(time);
        System.out.println("Start time :"+time);
    }

    @When("I enter Transit Time as {string}")
    public void transitTimeField(String time) {
        loginAction.EnterTransitTime(time);
        System.out.println("Transit time :"+time);
    }

    @When("I click on VehicleType Field")
    public void clickOnVehicleType() {
        loginAction.ClickOnVehicleType();
    }

    @And("I choose {string}")
    public void chooseVehicletype(String vehicle) {
        loginAction.SelectVehicleType();
        System.out.println("Vehicle Type chosen :" +vehicle);

    }

    @Then("I click On save")
    public void clickOnSave() throws InterruptedException {
        loginAction.ClickSave();
        Thread.sleep(1000);
        System.out.println("Connection created sucessfully");
    }

    //Edit connection : TC 1

    @When("I click on Edit Action")
    public void clickOnEdit() {
        loginAction.ClickOnEdit();
        System.out.println("Edit Linehaul pop-up page displayed");
    }

    @And("I edit the Repeat frequency field")
    public void editRepeatField() {
        loginAction.editRepeatFrequency();
    }

   /* @And("I click on save button in edit linehaul pop-up")
    public void SaveEdited() {
        loginAction.saveEdited();
    }*/

    @Then("Edit is sucessfully done the existing connection")
    public void EditSuccess() {
        System.out.println("Edit is sucessfully done the existing connection : Takes back to Linehaul details page ");
    }

    //Sort by origin hub





}
