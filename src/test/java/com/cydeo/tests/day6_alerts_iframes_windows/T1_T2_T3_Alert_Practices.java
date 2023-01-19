package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_T2_T3_Alert_Practices {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    @Test(priority = 1)
    public void confirmationAlert(){
        //3. Click to "Click for JS Confirm" button
        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();

        //4. Click to OK button from the alert
        driver.switchTo().alert().accept();

        //5. Verify "You clicked: Ok" text is displayed."
        WebElement msg = driver.findElement(By.xpath("//p[@id='result']"));
        String actualMsg = msg.getText();
        String exceptMsg = "You clicked: Ok";
        Assert.assertEquals(actualMsg,exceptMsg, "Result text is NOT Displayed!!!");
    }

    @Test (priority = 2)
    public void informationAlert1(){
        //3. Click to "Click for JS Alert" button
        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();

        //4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //5. Verify "You successfully clicked an alert" text is displayed.
        String exceptMsg = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String actualMsg = "You successfully clicked an alert";
        Assert.assertEquals(actualMsg,exceptMsg);
    }

    @Test (priority = 3)
    public void informationAlert2(){
        //3. Click to "Click for JS Prompt" button
        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();

        //4. Send "hello" text to alert
        driver.switchTo().alert().sendKeys("hello");

        //5. Click to OK button from the alert
        driver.switchTo().alert().accept();

        //6. Verify "You entered: hello" text is displayed,
        String expectMsg = "You entered: hello";
        String actualMsg = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(actualMsg,expectMsg,"Expected text is NOT Displayed!!!");
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}
