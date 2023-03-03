package com.cydeo.tests.day10_UploadFile;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSExecutorIntro {

    @Test
    public void javascriptExecutorIntroTest(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        ((JavascriptExecutor)driver).executeScript("");

    }
}
