package com.cydeo.tests.base;

import com.cydeo.tests.utilities_methods.BrowserUtils;
import com.cydeo.tests.utilities_methods.ConfigurationReader;
import com.cydeo.tests.utilities_methods.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class TestBase {
    protected WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }

    @AfterMethod
    public void teardownMethod(){
        BrowserUtils.sleep(3);
        driver.quit();
        //driver.close();
    }

}
