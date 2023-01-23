package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_ScrollUsingJSExecutor {

    @Test
    public void scrollJSExecutor(){

        //1- Open a Chrome browser
        //2- Go to: https://practice.cydeo.com/large
        Driver.getDriver().get("https://practice.cydeo.com/large");

        //3- Scroll down to “Cydeo” link
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        WebElement cydeo = Driver.getDriver().findElement(By.xpath("//a[.='CYDEO']"));
        js.executeScript("arguments[0].scrollIntoView(true)",cydeo);
        BrowserUtils.sleep(2);

        //4- Scroll up to “Home” link
        WebElement home = Driver.getDriver().findElement(By.xpath("//a[.='Home']"));
        js.executeScript("arguments[0].scrollIntoView(true)",home);
        //5- Use below provided JS method only
        //
        //JavaScript method to use : arguments[0].scrollIntoView(true)
        //
        //Note: You need to locate the links as web elements and pass them as arguments into executeScript() method

    }

}
