package com.cydeo.tests.day05_TestNG;

import com.cydeo.tests.utilities_methods.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SelectDropdown {
    WebDriver driver;
    @BeforeMethod
    public void SetUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void TearsDownMethod(){
        driver.quit();
    }

    @Test
    public void SelectDropdownTest(){
        driver.get("https://practice.cydeo.com/dropdown");

        // Simple Dropdown
        Select simpleSelect = new Select(driver.findElement(By.id("dropdown")));
        simpleSelect.selectByVisibleText("Option 2");

        //Select your date of birth
        Select DOF = new Select(driver.findElement(By.id("year")));
        DOF.selectByValue("1996");

        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByIndex(6);

        Select dayOfBirth = new Select(driver.findElement(By.id("day")));
        dayOfBirth.selectByVisibleText("15");


        //Select State
        Select State = new Select(driver.findElement(By.id("state")));
        State.selectByVisibleText("Florida");

        //Select Programming Languages; Select multiple option with the select methods
        Select ProgLang = new Select(driver.findElement(By.name("Languages")));
        ProgLang.selectByIndex(0);
        ProgLang.selectByValue("js");
        ProgLang.selectByVisibleText("C#");
        //ProgLang.deselectAll(); We can use this method to deselect all.


        /*Select Website
        driver.findElement(By.id("dropdownMenuLink")).click();
        driver.findElement(By.linkText("Yahoo")).click();
         */
    }



















}
