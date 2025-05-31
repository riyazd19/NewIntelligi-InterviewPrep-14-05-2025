package session_38_ScreenShot_Headless_SSL_AdBlock_Extentions;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotSelenium {

    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        TakesScreenshot ts=(TakesScreenshot) driver;
        //ts.getScreenshotAs()
    }
}
