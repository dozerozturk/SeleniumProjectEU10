package com.cydeo.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW5_FacebookTitleVerification {

    public static void main(String[] args) {

        //Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        /*
        Verify title:
        Expected: “Facebook - Log In or Sign Up”
         */
        String expectedFBHomePageTitle = "Facebook - Log In or Sign Up";
        String actualFBHomePageTitle = driver.getTitle();
        if (actualFBHomePageTitle.equals(expectedFBHomePageTitle)){
            System.out.println("Facebook Home Page Title Verification PASSED!");
        }else {
            System.err.println("Facebook Home Page Title Verification FAILED!!!");
        }

        //Enter incorrect username
        WebElement usernameInputBox = driver.findElement(By.id("email"));
        usernameInputBox.sendKeys("incorrectusername");

        //Enter incorrect password
        WebElement passwordInputBox = driver.findElement(By.id("pass"));
        passwordInputBox.sendKeys("incorrectpassword");

        //Click Log In Button
        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();

        /*
        Verify title changed to:
        Expected: “Log into Facebook”
         */
        String expectedIncorrectInfoTitle = "Log into Facebook";
        String actualIncorrectInfoTitle = driver.getTitle();
        if (actualIncorrectInfoTitle.equals(expectedIncorrectInfoTitle)) {
            System.out.println("Incorrect Info Warning Page Title Verification PASSED!");
        }else {
            System.out.println("Incorrect Info Warning Page Title Verification FAILED!!!");
        }


    }
}
