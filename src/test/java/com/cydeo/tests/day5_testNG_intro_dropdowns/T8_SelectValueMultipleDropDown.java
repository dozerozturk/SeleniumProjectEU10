package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T8_SelectValueMultipleDropDown {

    WebDriver driver;

    //TC #8: Selecting value from multiple select dropdown
    //1. Open Chrome browser
    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void selectValueMultipleDropDown(){

     //3. Select all the options from multiple select dropdown.
        Select languages = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        List<WebElement> webElementList = languages.getOptions();

     //4. Print out all selected values.
        for (WebElement webElement : webElementList ){
            webElement.click();
        }

        for (WebElement webElement : webElementList){
            System.out.println(webElement.getAttribute("value"));
        }

     //5. Deselect all values.
        languages.deselectAll();


    }

    @AfterMethod
    public void close(){
        driver.close();
    }

}
