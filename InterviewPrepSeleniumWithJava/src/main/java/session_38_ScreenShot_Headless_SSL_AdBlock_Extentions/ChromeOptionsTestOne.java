package session_38_ScreenShot_Headless_SSL_AdBlock_Extentions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeOptionsTestOne {
   static WebDriver driver;

    public static void main(String[] args) {
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--headless=new");
        driver= new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.quit();


    }
}
