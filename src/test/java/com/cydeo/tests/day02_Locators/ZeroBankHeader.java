package com.cydeo.tests.day02_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankHeader {
    public static void main(String[] args) {
        // 1- Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2- Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        // 3- Verify header text ---- Expected: "Log in to ZeroBank"
        WebElement headerText = driver.findElement(By.tagName("h3"));

        String expectedHeader = "Log ino to ZeroBank";
        String actualHeader = headerText.getText(); //get Text will find the string of the Web Element

        if (actualHeader.equals(expectedHeader)){
            System.out.println("Verification Header Passed");
        }else {
            System.out.println("\""+actualHeader+"\""+" is different from "+"\""+expectedHeader+"\"");
        }
        driver.close();

    }
}
