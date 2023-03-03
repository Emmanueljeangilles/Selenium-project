package com.cydeo.tests.day05_TestNG;

import com.cydeo.tests.utilities_methods.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Dropdown {
    WebDriver driver;
    @BeforeMethod
    public void SetUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }

    @Test
    public void HtlmDropdownTest(){
        driver.get("https://practice.cydeo.com/dropdown");
        //Locate the dropdown in click  on it
        driver.findElement(By.id("dropdownMenuLink")).click();
        //Locate the given selection in click on it
        driver.findElement(By.linkText("Yahoo")).click();



    }

















}
