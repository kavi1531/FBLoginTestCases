package CommonElements;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static CommonElements.ExtentReportManager.extent;


public class Baseclass  {
    protected WebDriver driver;

    private ExtentReports extent;
    private ExtentTest test;
    @BeforeMethod
    public void Driverinit ()
    {

        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();


        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.facebook.com/");
        extent = ExtentReportManager.getInstance();
        test = extent.createTest("Valid and Invalid FB Login", "Testing the FB login page with both valid and invalid credentials");
    }



    @AfterMethod
    public void Driverclean()
    {
        driver.quit();
        extent.flush();
    }

}

