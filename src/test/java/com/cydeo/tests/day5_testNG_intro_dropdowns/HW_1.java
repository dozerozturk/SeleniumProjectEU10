//package com.cydeo.tests.day5_testNG_intro_dropdowns;
//
//import com.cydeo.tests.utilities.WebDriverFactory;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.util.concurrent.TimeUnit;
//
//public class HW_1 {
//
//    WebDriver driver;
//
//    //TC #7: Selecting value from non-select dropdown
//    //1. Open Chrome browser
//    @BeforeMethod
//    public void setup(){
//        driver = WebDriverFactory.getDriver("chrome");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        //2. Go to https://www.alodokter.com/
//        driver.get("https://www.alodokter.com/");
//
//    }
//
//    //3. Click to non-select dropdown
//    @Test
//    public void selectNonSelectDropDown(){
//        WebElement dropDownLinkButton = driver.findElement(By.xpath("//*[@id=\"593668d76fcb9806fd52ff2a\"]/span"));
//        dropDownLinkButton.click();
//
//    //4. Select Facebook from dropdown
//        WebElement DoctorKandungan = driver.findElement(By.xpath("//*[@id=\"593668d76fcb9806fd52ff2a\"]/span"));
//        DoctorKandungan.click();
//
//    //5. Verify title is “Facebook - Log In or Sign Up”
//        String expectTitle = "Facebook - Log In or Sign Up";
//        String actualTitle = driver.getTitle();
//
//        Assert.assertEquals(actualTitle, expectTitle);
////Test fails, because actual title is "Facebook – log in or sign up"
//    }
//
//    @AfterMethod
//    public void close(){
//        driver.close();
//    }
//
//}
//
//    //Use Selenium, IntelliJ and Java.
//    //
//    //1. Open Chrome browser
//    //2. Go to https://www.alodokter.com/
//    //3. Select Dokter Psikiater, click
//    //4. Select dr. Yossy Agustanti Indradjaja, Sp.KJ
//    //5. verify title is "dr. Yossy Agustanti Indradjaja, Sp.KJ - Buat Janji Dokter, Biaya Konsultasi - Alodokter"
//    //6. Close
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//}
