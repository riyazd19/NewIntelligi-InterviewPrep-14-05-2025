package session_37_JsExeScrollAndUploadFile;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInOutJsExecutor {

    static WebDriver driver;
    //https://testautomationpractice.blogspot.com/
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        JavascriptExecutor js= (JavascriptExecutor)driver;
        Thread.sleep(5000);
        js.executeScript("document.body.style.zoom='50%");
    }
}
