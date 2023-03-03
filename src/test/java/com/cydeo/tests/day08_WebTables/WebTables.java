package com.cydeo.tests.day08_WebTables;

import com.cydeo.tests.utilities_methods.ConfigurationReader;
import com.cydeo.tests.utilities_methods.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WebTables {
    /* We gonna use Driver class instead of this method
    WebDriver driver;
    @BeforeMethod
    public void SetUpMethod(){
        //driver = WebDriverFactory.getDriver("chrome");
        //Using the configuration reader to call the driver and minimize the hard coding
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void TearsDownMethod(){
        driver.quit();
    }*/

    @Test
    public void WebTablesTest() {
        //driver.get("https://practice.cydeo.com/tables");
        // Using the key from the environment
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        //To locate the object of a table we follow those step
        WebElement FirstName = Driver.getDriver().findElement(By.xpath("//table[@id='table1']//tbody//tr[3]//td[2]"));
        Assert.assertTrue(FirstName.isDisplayed());
        //To locate the name on the table
        System.out.println("FirstName.getText() = " + FirstName.getText());
        //To locate the list of element on the table
        List<WebElement> bodyRow3 = Driver.getDriver().findElements(By.xpath("//table[@id='table1']//tbody//tr[3]//td"));
        for (WebElement eachCell : bodyRow3) {
            System.out.println("eachCell.getText() = " + eachCell.getText());
        }
    }}
