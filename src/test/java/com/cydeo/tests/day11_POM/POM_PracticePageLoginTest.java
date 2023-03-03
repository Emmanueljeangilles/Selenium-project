package com.cydeo.tests.day11_POM;

import com.cydeo.tests.pages.PracticePageLoginPage;
import com.cydeo.tests.utilities_methods.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class POM_PracticePageLoginTest {
    @Test
    public void practicePageLoginTestWithPOM(){

        Driver.getDriver().get("https://practice.cydeo.com/login");

        PracticePageLoginPage practicePageLogin = new PracticePageLoginPage();

        practicePageLogin.username.sendKeys("tomsmith");
        practicePageLogin.password.sendKeys("SuperSecretPassword");
        practicePageLogin.loginBtn.click();

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Secure Area";

        Assert.assertEquals(actualTitle,expectedTitle,"Secure Area title did not appear!");
    }
}
