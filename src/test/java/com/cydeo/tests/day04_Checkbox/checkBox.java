package com.cydeo.tests.day04_Checkbox;

import com.cydeo.tests.utilities_methods.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class checkBox {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/checkboxes");
        WebElement checkbox1 =driver.findElement(By.xpath("//input[@id='box1']"));
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        //After Clicking and check if it's enable
        checkbox1.click();
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        System.out.println("checkbox1.isEnabled() = " + checkbox1.isEnabled());



        driver.quit();
    }
}
