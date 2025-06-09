package session_38_ScreenShot_Headless_SSL_AdBlock_Extentions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class SpecificElementScreenShot {

    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        ////div[@aria-label='1 / 2']//a
        TakesScreenshot ts= (TakesScreenshot) driver;
        WebElement specifSS= driver.findElement(By.xpath("//ul[@class='top-menu notmobile']"));
        File sourceLoc=specifSS.getScreenshotAs(OutputType.FILE);
        File targetLoc=new File("D:\\InterviewPrepIntelligi\\NewIntelligi-InterviewPrep-14-05-2025\\InterviewPrepSeleniumWithJava\\screenShots\\specificePart.png");
        sourceLoc.renameTo(targetLoc);
        driver.quit();
    }

}
