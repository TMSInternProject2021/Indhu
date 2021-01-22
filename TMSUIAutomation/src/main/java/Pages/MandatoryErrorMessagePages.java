package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MandatoryErrorMessagePages {
    WebDriver driver;

    public MandatoryErrorMessagePages(WebDriver webDriver){
        driver=webDriver;
    }

    @FindBy(xpath = "//div//button[@class='default-button pull-right marigin-top10 btn']")
    WebElement clickAdd;
    public void clickOnAdd() {
        clickAdd.click();
    }

    @FindBy(xpath = "//input[@class='input-box-style input dropdown large']")
    WebElement clickOriginHub;

    @FindBy(xpath = "//div//div//input[@class='input-box-style input dropdown large']")
    WebElement clickDestHub;

    public void invalidData() throws InterruptedException {
        clickOriginHub.sendKeys("cbe");
        Thread.sleep(1000);
        clickDestHub.sendKeys("sal");
    }

    public boolean verifyMandatoryErrorMessageIsThrown(){
        WebElement errorMsg = driver.findElement(By.xpath("//div//div//span[@class='error-msg error']"));
        String error ="Please select a Hub";
        if(errorMsg.getText().equals(error))
            return true;
        return false;
    }

}
