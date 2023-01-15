package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_DropDownSelect {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void selectDropDown(){
        //3. Select Illinois
        Select stateDropDown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        stateDropDown.selectByIndex(15);
        //4. Select Virginia
        stateDropDown.selectByVisibleText("Virginia");

        //5. Select California
        stateDropDown.selectByValue("CA");

        //6. Verify final selected option is California.
        String expectedCalifornia = "California";
        String actualCalifornia = stateDropDown.getFirstSelectedOption().getText();

        //Use all Select options. (visible text, value, index)

    }

    @AfterMethod
    public void close(){
        driver.close();
    }

}
