package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_navigation {
    public static void main(String[] args) throws InterruptedException {
        //Set up browser manager
        WebDriverManager.chromedriver().setup();

        //Create instance of Chrome
        WebDriver driver = new ChromeDriver();

        //This line will maximize the currently opened browser
         driver.manage().window().maximize();
        // driver.manage().window().fullscreen(); >>> MacBook

        //Instruction
        driver.get("https://www.tesla.com");

        //Get current URl
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        //Use navigate back() to go back
        driver.navigate().back();

        //Slow down selenium
        //Thread.sleep(10000);

        //Use navigate forward() to go forward
        driver.navigate().forward();

        //User refresh the page
        driver.navigate().refresh();

        //Navigate to google.com using navigate(). to ()
        driver.navigate().to("https://www.google.com");

        //Get current URl
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        //Get title
        System.out.println(driver.getTitle());

        //Close method for the current window
         driver.close();

        //Close method for all windows
        //driver.quit();




    }
}
