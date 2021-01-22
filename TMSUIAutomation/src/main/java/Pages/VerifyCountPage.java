package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VerifyCountPage {
    WebDriver driver;

    public VerifyCountPage(WebDriver webDriver){
        driver=webDriver;
    }


    @FindBy(xpath = "//div//div//span//input[@class='input-box-style pull-left search-bar']")
    WebElement search;

    @FindBy(xpath = "//div//div[@class='option'][1]")
    WebElement chooseHub;

    @FindBy(xpath = "//div//div//button[contains(text(),'Search')]")
    WebElement clickOnSearch;

    public void performSearch() throws InterruptedException {
       search.click();
       search.sendKeys("Ceper");

        chooseHub.click();
        clickOnSearch.click();
        Thread.sleep(1000);
    }

    @FindBy(xpath = "//table/tbody/tr")
    List<WebElement> rows;

    int count;

    public void countConnectionList() {
        count = rows.size();
        System.out.println("ROW COUNT : "+count);
    }

    @FindBy(xpath = "//div//div//span[@c" +
            "lass='bold-font'][2]")
    WebElement countDisplayed;
    String ct;
    public void countDisplayedAtEnd() {
         ct=countDisplayed.getText();
    }

    public boolean check() {
        if((String.valueOf(count)).equals(ct))
            return true;
        return false;
    }
}
