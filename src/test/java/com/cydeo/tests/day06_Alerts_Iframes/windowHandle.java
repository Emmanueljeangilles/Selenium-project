package com.cydeo.tests.day06_Alerts_Iframes;

import com.cydeo.tests.utilities_methods.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class windowHandle {
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
    public void windowsTest(){
        driver.get("https://practice.cydeo.com/windows");
        //To store the current window ID
        String currentWindows = driver.getWindowHandle();
        System.out.println("currentWindows = " + currentWindows);

        //Even after clicking on it, the ID stay the same cause the driver still on the first window
        driver.findElement(By.linkText("Click Here")).click();
        System.out.println("currentWindows = " + currentWindows);

        //Store all the window in a set of string
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("allWindows = " + allWindows);

        for (String eachWindow : allWindows) {
            //Method to switch to each window one by one and we print out the title to confirm
            driver.switchTo().window(eachWindow);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }

    }
}
