package com.cydeo.tests.day02_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForthNavigation {
    public static void main(String[] args) throws InterruptedException {
        // 1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();

        // 2- Go to https://google.com
        driver.get("https://www.google.com/");

        // 3- Click to Gmail from top right
        WebElement mailLink = driver.findElement(By.linkText("Gmail"));
        mailLink.click();

        //Thread.sleep(1000); method to slow the automation for 10sec

        // 4- Verify title contains: Expected: Gmail
        String expectedTitle = "Gmail: Private and secure email at no cost | Google Workspace";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Verification 1 Passed");
        }else {
            System.out.println("Verification 1 Failed");
        }

        // 5- Go back to Google by using the .back();
        driver.navigate().back();

        // 6- Verify title equals: Expected: Google
        String expectedTitle2 = "Google";
        String actualTitle2 = driver.getTitle();

        if(expectedTitle2.equals(actualTitle2)){
            System.out.println("Verification 2 Passed ");
        }else {
            System.out.println("Verification 2 Failed ");
        }

        driver.close();
    }
}
