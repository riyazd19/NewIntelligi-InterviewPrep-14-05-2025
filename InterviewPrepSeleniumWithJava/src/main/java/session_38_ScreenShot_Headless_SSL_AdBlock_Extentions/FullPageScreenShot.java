package session_38_ScreenShot_Headless_SSL_AdBlock_Extentions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class FullPageScreenShot {

    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        TakesScreenshot ts = (TakesScreenshot) driver;
        File sourceFile=ts.getScreenshotAs(OutputType.FILE);//Taking screenshot
        //File targetFile= new File(System.getProperty("user.dir")+" " +
          //      "NewIntelligi-InterviewPrep-14-05-2025\\" +
            //    "InterviewPrepSeleniumWithJava\\" +
              //  "screenShots\\fullPage.png");//specifying path where to save

        File targetFile= new File("D:\\InterviewPrepIntelligi\\" +
                "NewIntelligi-InterviewPrep-14-05-2025\\InterviewPrepSeleniumWithJava\\" +
               "screenShots\\fullPage.png");//specifying path where to save



        sourceFile.renameTo(targetFile);// copying from source to target
        driver.quit();
    }
}
