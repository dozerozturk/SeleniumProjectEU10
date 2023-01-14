package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T6_selectDateDropDown {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        //TC #6: Selecting date on dropdown and verifying
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

    }

    //3. Select “December 1st, 1923” and verify it is selected.
    //Select year using  : visible text
    @Test(priority = 1)
    public void selectYear(){

    }


    //Select month using   : value attribute
    @Test(priority = 2)
    public void selectMonth(){
        Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        month.selectByValue("11");
        String expectMonth = "December";
        String actualMonth = month.getFirstSelectedOption().getText();
        Assert.assertEquals(actualMonth,expectMonth);
    }


    //Select day using : index number
    @Test(priority = 3)
    public void selectDay(){
        Select day = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        day.selectByIndex(0);
        String expectDay = "1";
        String actualDay = day.getFirstSelectedOption().getText();
        Assert.assertEquals(actualDay, expectDay);
    }

    @AfterMethod
    public void close(){

        driver.close();
    }

}


