package com.cydeo.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1_EtsyTitleVerification {

    public static void main(String[] args) {

        // Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

        // Search for “wooden spoon”
        WebElement searchInputBox = driver.findElement(By.id("global-enhancements-search-query"));
        searchInputBox.sendKeys("wooden spoon" + Keys.ENTER);

        //Verify title:
        //Expected: “Wooden spoon | Etsy”

        String actualWoodenSpoonTitle = driver.getTitle();
        String expectedWoodenSpoonTitle = "Wooden spoon | Etsy";

        if (actualWoodenSpoonTitle.equals(expectedWoodenSpoonTitle)){
            System.out.println("Title Verification PASSED!");
        }else {
            System.err.println("Title Verification FAILED!!!");
        }



    }
}
