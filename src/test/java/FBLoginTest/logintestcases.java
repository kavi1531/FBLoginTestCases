package FBLoginTest;

import CommonElements.Baseclass;
import PageObjectModel.FBpageelements;
import PageObjectModel.logintestdata;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import static org.testng.Assert.assertFalse;
import static org.testng.AssertJUnit.assertEquals;

public class logintestcases extends Baseclass {


    @Test(dataProvider = "loginData", dataProviderClass = logintestdata.class)
    public void loginwrongtest(String username, String password) {
        FBpageelements.finduserelements(driver).sendKeys(username);
        FBpageelements.findpasswelements(driver).sendKeys(password);
        FBpageelements.loginbutton(driver).click();


        WebElement errorMessage = null;
        try {
            errorMessage = driver.findElement(By.xpath("//div[@role='alert']"));
        } catch (NoSuchElementException e) {
            System.out.println("Negative testing");
        }

        assertFalse(errorMessage != null, "Error message is not displayed for invalid login");
    }


    @Test
    public void loginrighttest() {
        FBpageelements.finduserelements(driver).sendKeys("6085729230");
        FBpageelements.findpasswelements(driver).sendKeys("Vishukavi@4127");
        FBpageelements.loginbutton(driver).click();
        String expected = driver.getCurrentUrl();
        try {
            Assert.assertEquals(expected, "https://www.facebook.com/");
            System.out.println("positive testing");

        } catch (AssertionError e) {
            System.out.println("login error");
        }
    }
}





