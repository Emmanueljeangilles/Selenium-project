package com.cydeo.tests.day04_Checkbox;

import com.cydeo.tests.utilities_methods.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Radio_Buttons {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/radio_buttons");
        //Find Element with Xpath
        WebElement blueRadioButton = driver.findElement(By.xpath("//input[@id='blue']"));
        WebElement YellowRadioButton = driver.findElement(By.xpath("//input[@id='yellow']"));

        //Verify if the buttons is selected by using the "isSelected" method
        System.out.println("BlueButton = " + blueRadioButton.isSelected());
        //Before Clicking
        System.out.println("Yellow Button = "+driver.findElement(By.xpath("//input[@id='yellow']")).isSelected());

        //Click on the radio button to make sure is selected
        YellowRadioButton.click();
        System.out.println("Yellow Button = "+driver.findElement(By.xpath("//input[@id='yellow']")).isSelected());
        System.out.println("YellowRadioButton.isEnabled() = " + YellowRadioButton.isEnabled());

        //Double check if it's enable
        WebElement GreenRadioButton = driver.findElement(By.xpath("//input[@id='green']"));
        GreenRadioButton.click();
        System.out.println("GreenRadioButton.isSelected() = " + GreenRadioButton.isSelected());
        System.out.println("GreenRadioButton.isEnabled() = " + GreenRadioButton.isEnabled());


    }
}
