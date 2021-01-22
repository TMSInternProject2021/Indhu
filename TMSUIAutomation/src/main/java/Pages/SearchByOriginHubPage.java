package Pages;

import com.sun.xml.internal.xsom.XSUnionSimpleType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchByOriginHubPage {

    WebDriver driver;
    public SearchByOriginHubPage(WebDriver webDriver){
        driver=webDriver;
    }
    @FindBy(xpath = "//div//div//table//span//label[@class='clickable']")
    WebElement search;
    public void clickOnOriginHubToSearch() {
        search.click();
    }

    @FindBy(xpath = "(//div//div//label[contains(text(),'Ceper Hub')])")
    WebElement chooseHub;

    @FindBy(xpath = "//div//div[@class='margin-b10']")
    WebElement clickTab;
    public void chooseHubThatNeedsToBeSearched() {
        chooseHub.click();
        clickTab.click();
    }



    @FindBy(xpath = "(//div//div//span[@class='bold-font'])[3]")
    WebElement searchCount;
    public boolean verifySearchByOriginHubIsPerformed(){
        int count=Integer.parseInt(searchCount.getText());
        int tableCount = 0;
        for(int i=1;i<count+1;i++) {
            WebElement searchResults = driver.findElement(By.xpath("//div//table//tr["+i+"]//td"));
            if(searchResults.getText().equals("Ceper Hub"))
            {
                tableCount++;
                System.out.println(tableCount);
            }

        }
        if(count==tableCount)
            return true;
        return false;


    }



}
