package com.cydeo.tests.pages;

import com.cydeo.tests.utilities_methods.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticePageLoginPage {
    public PracticePageLoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name="username")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(id ="wooden_spoon")
    public WebElement loginBtn;

}

