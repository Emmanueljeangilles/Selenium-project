package com.cydeo.tests.day10_UploadFile;

import com.cydeo.tests.utilities_methods.ConfigurationReader;
import com.cydeo.tests.utilities_methods.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class day10_uploadFile {
    @Test
    public void FileUploadTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        WebElement chooseFile = Driver.getDriver().findElement(By.id("file-upload"));
        chooseFile.sendKeys("C:\\Users\\jeang\\Downloads\\Screenshot 2023-02-21 004948.png");
        Driver.getDriver().findElement(By.id("file-submit")).click();
    }
}
