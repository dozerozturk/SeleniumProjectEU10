//package com.cydeo.tests.day5_testNG_intro_dropdowns;
//
//import com.cydeo.utilities.WebDriverFactory;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.util.concurrent.TimeUnit;
//
//public class HW_1B {
//
//    WebDriver driver;
//
//    @BeforeMethod
//    public void setup() {
//        // 1. Open Chrome browser
//        driver = WebDriverFactory.getDriver("chrome");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        // 2. Go to https://www.alodokter.com/
//        driver.get("https://www.alodokter.com/");
//    }
//
//    @Test
//    public void  selectNonSelectDropDown() {
//
//        // 3. Select Dokter Psikiater, click
//        WebElement dropDownLinkButton = driver.findElement(By.xpath("//*[@id=\"searchSpecialities\"]"));
//        dropDownLinkButton.click();
//
//        WebElement Specialist = driver.findElement(By.xpath("//*[@id=\"593669c36fcb9806fd52ff31\"]"));
//        Specialist.click();
//
//        // 4. Select dr. Yossy Agustanti Indradjaja, Sp.KJ
//        WebElement Doctor = driver.findElement(By.xpath("//*[@id=\"listings\"]/card-item-list-mobile[8]//a/div[1]/div[2]/div"));
//        Doctor.click();
//
//        // 5. Verify title is "dr. Yossy Agustanti Indradjaja, Sp.KJ - Buat Janji Dokter, Biaya Konsultasi - Alodokter"
//        String expectedTitle = "dr. Yossy Agustanti Indradjaja, Sp.KJ - Buat Janji Dokter, Biaya Konsultasi - Alodokter";
//        String actualTitle = driver.getTitle();
//        if (expectedTitle.equals(actualTitle)) {
//            System.out.println("Title verified");
//        } else {
//            System.out.println("Title not verified");
//        }
//
//    }
//
//    @AfterMethod
//    public void close(){
//
//        // 6. Close
//        driver.close();
//    }
//}
//
//
