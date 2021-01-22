package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditConnectionPage {
    WebDriver driver;

    public EditConnectionPage(WebDriver webDriver){
        driver=webDriver;
    }


   @FindBy(xpath = "//div//button[@class='default-button pull-right marigin-top10 btn']")
    WebElement clickAdd;

    @FindBy(xpath = "//input[@class='input-box-style input dropdown large']")
    WebElement clickOriginHub;

    @FindBy(xpath = "//div//div[@class='option'][1]")
    WebElement chooseOrigin;

    @FindBy(xpath = "(//div//input[@class='input-box-style input dropdown large'])[2]")
    WebElement clickDestHub;

    @FindBy(xpath = "(//div//div[contains(text(),'TMS Hub')])[2]")
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

    public void createConnection() throws InterruptedException {

        clickAdd.click();
        clickOriginHub.sendKeys("Be");

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

    @FindBy(xpath="(//div//div//span//img[@class='icon'])[1]")
    WebElement edit;
    public void clickOnEditAction() throws InterruptedException {
        Thread.sleep(1000);
        edit.click();
    }

    @FindBy(xpath = "//div//div//div//input[@class='input-box-style dropdown']")
    WebElement repeat1;

    @FindBy(xpath = "//div//div//span[contains(text(),'Monday')]")
    WebElement editRepeat1;

    @FindBy(xpath = "//div//div//span[contains(text(),'Thursday')]")
    WebElement editRepeat2;

    @FindBy(xpath = "//div//div//button[contains(text(),'Save')]")
    WebElement save1;

    public void editFields() throws InterruptedException {
        repeat1.click();
        editRepeat1.click();
        Thread.sleep(1000);
        editRepeat2.click();
        Thread.sleep(1000);
        save1.click();
        Thread.sleep(1000);
    }

    public void verifyConnectionIsEdited() {
        WebElement editSuccess=driver.findElement(By.xpath("//div//div//p[contains(text(),'Successfully updated')]"));
        System.out.println(editSuccess.getText());
    }
}
