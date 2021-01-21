package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SortByOriginHubPage {
    WebDriver driver;
    public SortByOriginHubPage(WebDriver webDriver){
        driver=webDriver;
    }

    @FindBy(xpath = "//div//div//table//span[@class='icon-down-arrow down']")
    WebElement sort;

    public void ClickDownArrowToSort() {
        sort.click();
    }
}
