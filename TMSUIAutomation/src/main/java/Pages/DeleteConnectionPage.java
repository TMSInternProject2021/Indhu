package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteConnectionPage {

    WebDriver driver;
    public DeleteConnectionPage(WebDriver webDriver){
        driver=webDriver;
    }

   @FindBy(xpath = "//div//button[@class='default-button pull-right marigin-top10 btn']")
    WebElement clickAdd;

    @FindBy(xpath = "//input[@class='input-box-style input dropdown large']")
    WebElement clickOriginHub;

    @FindBy(xpath = "(//div//div[@class='option'])")
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

    public void createNewConnection() throws InterruptedException {

            clickAdd.click();
            clickOriginHub.sendKeys("Badak");

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

            startTime.sendKeys("19:00");
            transitTime.sendKeys("100:08");

            vehicleType.click();
            choosevehicle.click();
            Thread.sleep(1000);

            save.click();
            Thread.sleep(1000);
    }

    @FindBy(xpath = "//div//div//span//img[@class='icon margin-l10']")
    WebElement delete;
    public void clickDelete() {
        delete.click();
    }


    public void verifyConnectionIsDeleted(){
        WebElement deleteSuccess=driver.findElement(By.xpath("//div//div//p[contains(text(),'Linehaul connection between Badak and TMS Hub has been deleted succesfully')]"));
        System.out.println(deleteSuccess.getText());
    }
}
