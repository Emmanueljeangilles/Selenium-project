package com.cydeo.tests.day10_UploadFile;

import com.cydeo.tests.base.TestBase;
import com.cydeo.tests.utilities_methods.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop extends TestBase {
    @Test
    public void dradAndDrop(){
        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");
        WebElement smallcircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigcercle = Driver.getDriver().findElement(By.id("droptarget"));

        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(smallcircle,bigcercle).perform();
    }
}
