package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.tests.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Registration_Form {



    @Test
    public void test(){

    //1. Open browser
    //2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get("https://practice.cydeo.com/registration_form");

    //3. Enter first name
    Faker faker = new Faker();
    WebElement firstNameBox = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        firstNameBox.sendKeys(faker.name().firstName());

    //4. Enter last name
    WebElement lastNameBox = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        lastNameBox.sendKeys(faker.name().lastName());

    //5. Enter username
    WebElement usernameBox = Driver.getDriver().findElement(By.xpath("//input[@placeholder='username']"));
        usernameBox.sendKeys(faker.bothify("?????##"));

    //6. Enter email address
    WebElement emailBox = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        emailBox.sendKeys(faker.internet().emailAddress());

    //7. Enter password
    WebElement passwordBox = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        passwordBox.sendKeys(faker.internet().password());

    //8. Enter phone number
    WebElement phoneNumBox = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneNumBox.sendKeys(faker.numerify("536-###-####"));

    //9. Select a gender from radio buttons
    WebElement genderRadio = Driver.getDriver().findElement(By.xpath("//input[@value='male']"));
        genderRadio.click();

    //10. Enter date of birth
    WebElement birthdayBox = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        birthdayBox.sendKeys("03/04/1993");

    //11. Select Department/Office
    Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropdown.selectByIndex(1);

    //12. Select Job Title
    Select jobTitleDropDown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobTitleDropDown.selectByIndex(4);

    //13. Select programming language from checkboxes
    WebElement languageCheckBox = Driver.getDriver().findElement(By.xpath("//input[@value='java']"));
        languageCheckBox.click();

    //14. Click to sign up button
    WebElement signUpBtn = Driver.getDriver().findElement(By.xpath("//button[.='Sign up']"));
        signUpBtn.click();

    //15. Verify success message “You’ve successfully completed registration.” is
    //displayed.
    String expectedMsg = "You've successfully completed registration!";
    String actualMsg = Driver.getDriver().findElement(By.tagName("p")).getText();
        Assert.assertEquals(actualMsg,expectedMsg,"Actual Message is not match the expected Message");

    }

}
