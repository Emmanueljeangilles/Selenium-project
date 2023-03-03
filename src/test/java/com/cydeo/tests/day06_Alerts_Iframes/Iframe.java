package com.cydeo.tests.day06_Alerts_Iframes;

import com.cydeo.tests.utilities_methods.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Iframe {
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
    public void iFrameTest(){
        driver.get("https://practice.cydeo.com/iframe");

        /*location Using index number of iFrame
        driver.switchTo().frame(0);*/

        //Location Using id or  name attribute value
        //driver.switchTo().frame("mce_0_ifr");

        //Locate the iFrame by using id
        WebElement Iframe = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(Iframe);

        WebElement testArea = driver.findElement(By.xpath("//p[.='Your content goes here.']"));
        Assert.assertTrue(testArea.isDisplayed());

        /*When you're done using the iFrame you have to go back to the main HTLM if you need
        to locate more Web ELement on the main HTLM*/

        driver.switchTo().defaultContent();

        //0r you can use:
        // driver.switchTo().parentFrame();

        //Locate the Web element "Home" on the main page
        WebElement HomeLink = driver.findElement(By.linkText("Home"));
        Assert.assertTrue(HomeLink.isDisplayed());

    }




















}
