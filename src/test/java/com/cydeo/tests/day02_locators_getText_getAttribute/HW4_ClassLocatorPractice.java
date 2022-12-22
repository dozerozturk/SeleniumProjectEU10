package com.cydeo.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW4_ClassLocatorPractice {

    public static void main(String[] args) {

        // Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");

        // Click to “Home” link
        //PS: Locate “Home” link using “className” locator
        WebElement homeLink = driver.findElement(By.className("nav-link"));
        homeLink.click();

        /*
        Verify title is as expected:
        Expected: Practice
         */
        String expectedHomePageTitle = "Practice";
        String actualHomePageTitle = driver.getTitle();
        if (actualHomePageTitle.equals(expectedHomePageTitle)){
            System.out.println("Home Page Title Verification PASSED!");
        }else {
            System.err.println("Home Page Title Verification FAILED!!!");
        }


    }
}
