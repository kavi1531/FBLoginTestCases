package PageObjectModel;

import CommonElements.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FBpageelements extends Baseclass {

        private static WebElement element=null;

        public static WebElement finduserelements(WebDriver driver)
        {
            element = driver.findElement(By.id("email"));
            return element;

        }
        public static WebElement findpasswelements(WebDriver driver)
        {
            element = driver.findElement(By.id("pass"));
            return element;

        }
        public static WebElement loginbutton(WebDriver driver)
        {
            element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));

            return element;

        }




    }


