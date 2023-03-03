package com.cydeo.tests.day06_Alerts_Iframes;

import com.cydeo.tests.utilities_methods.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Alerts
{
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
    public void jsAlertTest(){
        driver.get("https://practice.cydeo.com/javascript_alerts");
        WebElement jsAlert = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        jsAlert.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();



    }























}
