package com.cydeo.tests.day02_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClasLocatorPractice {
    public static void main(String[] args) {
        // 1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");

        // 3- Click to "Home" link
        WebElement hitHome = driver.findElement(By.className("nav-link"));
        hitHome.click();

        // 4- Verify title is as expected : Expected : Practice
        String ActualElement = driver.getTitle(),
                ExpectedElement = "Practice";

        if(ExpectedElement.equals(ActualElement)){
            System.out.println("Test Passed");
        }
        if(!(ExpectedElement.equals(ActualElement))){
            System.out.println("Test Failed");
        }

        driver.close();


    }
}
