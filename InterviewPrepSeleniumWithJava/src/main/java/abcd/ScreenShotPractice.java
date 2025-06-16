package abcd;

import io.cucumber.java.sk.Tak;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScreenShotPractice {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        TakesScreenshot ts = (TakesScreenshot) driver;
        File sourceFIle1= ts.getScreenshotAs(OutputType.FILE);
        File targetFile= new File("D:\\InterviewPrepIntelligi\\NewIntelligi-InterviewPrep-14-05-2025" +
                "\\InterviewPrepSeleniumWithJava\\ScreenShotsPractice\\fullSS2"+timestamp+".png");
        sourceFIle1.renameTo(targetFile);
        driver.close();




    }
}
