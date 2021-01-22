package Pages;

import org.openqa.selenium.By;
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

    public void clickDownArrowToSort() throws InterruptedException {
        Thread.sleep(1000);
        sort.click();
    }

    public boolean verifySortByOriginHubInDescendingOrderIsPerformed(){
        WebElement count=driver.findElement(By.xpath("(//div//span[@class='bold-font'])[3]"));
        int countRows=Integer.parseInt(count.getText());
        countRows+=1;
        int i=1;
        while(i+1!=countRows){
            WebElement rowOne=driver.findElement(By.xpath("//div//table//tr["+i+"]//td"));
            WebElement rowTwo=driver.findElement(By.xpath("//div//table//tr["+(i+1)+"]//td"));
            if(rowTwo!=null && rowOne.getText().compareTo(rowTwo.getText())<0){
                return false;
            }
            i++;
        }
        return true;
    }

}
