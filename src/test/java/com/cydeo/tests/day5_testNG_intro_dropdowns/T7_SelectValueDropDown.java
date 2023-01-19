package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T7_SelectValueDropDown {

    WebDriver driver;

    //TC #7: Selecting value from non-select dropdown
    //1. Open Chrome browser
    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

    }

    //3. Click to non-select dropdown
    @Test
    public void selectNonSelectDropDown(){
        WebElement dropDownLinkButton = driver.findElement(By.xpath("//a[@class='btn btn-secondary dropdown-toggle']"));
        dropDownLinkButton.click();

    //4. Select Facebook from dropdown
        WebElement Facebook = driver.findElement(By.xpath("//a[.='Facebook']"));
        Facebook.click();

    //5. Verify title is “Facebook - Log In or Sign Up”
        String expectTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectTitle);
//Test fails, because actual title is "Facebook – log in or sign up"
    }

    @AfterMethod
    public void close(){
        driver.close();
    }

}
