package com.cydeo.tests.day05_TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstClass {

    @Test(priority = 1)//priority set the reading order of the test
    public void testofTestNG(){
        System.out.println("testofTestNG is running");
        Assert.assertEquals(3+2,5);
    }

    @Test(priority = 2)
    public void equalWord(){
        System.out.println("equalWord is running");
        Assert.assertEquals("Orange","Orange");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before method is running");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("AfterClass Method is running");
    }





























}
