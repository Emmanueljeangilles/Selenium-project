package com.cydeo.tests.day02_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsySearchTitle {
    public static void main(String[] args) {


        // 1-Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2-Go to https://wwww.etsy.com
        driver.get("https://www.etsy.com/");

        // 3-Search for "wooden spoon"
        //WebElement searchBar = driver.findElement(By.cssSelector("input[id='global-enhancements-search-query']")); Location of the element with CSS selector
        WebElement searchBar = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));//Location of the element with Xpath
        searchBar.sendKeys("Wooden spoon" + Keys.ENTER);

        // 4-Verify title : Expected : "Wooden spoon - Etsy"
        String expectedTitle = "Wooden spoon - Etsy";
        String actualTitle = driver.getTitle();

        // "If" condition to compare expected Title to actual Title
        if (expectedTitle.equals(actualTitle)){
            System.out.println("Etzy Verification PASSED");
        }else {
            System.out.println("AA voye");
        }
        driver.close();







    }
}
