package com.cydeo.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3_BackAndForthNavigation {

    public static void main(String[] args) {

        // Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Go to: https://google.com
        driver.get("https://google.com");

        // Click to Gmail from top right.
        WebElement emailButton = driver.findElement(By.linkText("Gmail"));
        emailButton.click();

        /*
        Verify title contains:
        Expected: Gmail
         */
        String expectedGmailPageTitle = "Gmail";
        String actualGmailPageTitle = driver.getTitle();
        if (actualGmailPageTitle.contains(expectedGmailPageTitle)){
            System.out.println("Gmail Page Title Verification PASSED!");
        }else {
            System.err.println("Gmail Page Title Verification FAILED!!!");
        }

        //Go back to Google by using the .back();
        driver.navigate().back();

        /*
        Verify title equals:
        Expected: Google
         */
        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();
        if (actualGoogleTitle.equals(expectedGoogleTitle)){
            System.out.println("Google Home Page Title Verification PASSED!");
        }else {
            System.out.println("Google Home Page Title Verification FAILED!!!");
        }


    }
}
