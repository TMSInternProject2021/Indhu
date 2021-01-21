package com.quinbay.automation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.SQLOutput;
import java.util.List;

public class VerifyCountPage {
    WebDriver driver;

    public VerifyCountPage(WebDriver webDriver){
        driver=webDriver;
    }


   @FindBy(xpath = "//div//div//span//input[@class='input-box-style pull-left search-bar']")
  //  @FindBy(xpath = "//*[@id=\"mount\"]/div/div/div[2]/div[2]/div[3]/div/div[1]/div/span/input")
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

    @FindBy(xpath = "//div//div//span[@class='bold-font'][2]")
    WebElement countDisplayed;
    String ct;
    public void CountDisplayedAtEnd() {
         ct=countDisplayed.getText();
    }

    public void check() {
        if((String.valueOf(count)).equals(ct))
            System.out.println("Both the counts are eqaul");

    }



}
