package abcd;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.ArrayList;

public class TakeScreeShotsTest {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
       TakesScreenshot ts= (TakesScreenshot) driver;
       File sourcrFIle= ts.getScreenshotAs(OutputType.FILE);
        File targetFile= new File("D:\\InterviewPrepIntelligi\\" +
                "NewIntelligi-InterviewPrep-14-05-2025\\InterviewPrepSeleniumWithJava\\" +
                "screenShots\\fullPage5.png");
        sourcrFIle.renameTo(targetFile);
        Thread.sleep(5000);
        JavascriptExecutor js=  (JavascriptExecutor) driver;
        js.executeScript("window.open()");
        ArrayList<String> tabs= new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
        driver.get("https://www.bing.com");


        //driver.quit();
    }
}
