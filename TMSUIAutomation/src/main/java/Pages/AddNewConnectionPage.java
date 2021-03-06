package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewConnectionPage {

    WebDriver driver;

    public AddNewConnectionPage(WebDriver webDriver){
        driver=webDriver;
    }

    @FindBy(xpath = "//div//button[@class='default-button pull-right marigin-top10 btn']")
    WebElement clickAdd;
    public void clickOnAdd() {
        clickAdd.click();
    }

    @FindBy(xpath = "//input[@class='input-box-style input dropdown large']")
    WebElement clickOriginHub;

    @FindBy(xpath = "(//div//div[@class='option'])[3]")
    WebElement chooseOrigin;

    @FindBy(xpath = "(//div//input[@class='input-box-style input dropdown large'])[2]")
    WebElement clickDestHub;

    @FindBy(xpath = "//div//div[@class='option']")
    WebElement chooseDest;

    @FindBy(xpath = "//div//input[@class='form-control']")
    WebElement date;

    @FindBy(xpath = "//div//div[@class='DayPicker-Day'][2]")
    WebElement chooseDate;

    @FindBy(xpath = "//div//div//div//input[@class='input-box-style dropdown']")
    WebElement repeat;

    @FindBy(xpath = "//div//div//div[@class='option'][2]")
    WebElement chooseFrequency;

    @FindBy(xpath = "(//div//input[@class='input-box-style input'])")
    WebElement startTime;

    @FindBy(xpath = "(//div//input[@class='input-box-style input'])[2]")
    WebElement transitTime;

    @FindBy(xpath = "(//div//div[@class='option'])[4]")
    WebElement choosevehicle;

    @FindBy(xpath = "(//div//input[@class='input-box-style input dropdown large'])[3]")
    WebElement vehicleType;

    @FindBy(xpath = "//div//div//button[contains(text(),'Save')]")
    WebElement save;

    public void fillAllFields() throws InterruptedException {
        clickOriginHub.sendKeys("Ce");
        chooseOrigin.click();
        Thread.sleep(1000);

        clickDestHub.sendKeys("TMS");
        chooseDest.click();
        Thread.sleep(1000);

        date.click();
        chooseDate.click();

        repeat.click();
        chooseFrequency.click();
        Thread.sleep(1000);

        startTime.sendKeys("13:00");
        transitTime.sendKeys("123:08");

        vehicleType.click();
        choosevehicle.click();
        Thread.sleep(1000);

        save.click();
        Thread.sleep(1000);
    }

    public boolean verifyConnectionCreated(){
        String success="Successfully added";
        WebElement addSuccess=driver.findElement(By.xpath("//div//div//p[contains(text(),'Successfully added')]"));
        if(addSuccess.getText().equals(success))
            return true;
        return false;

    }

}
