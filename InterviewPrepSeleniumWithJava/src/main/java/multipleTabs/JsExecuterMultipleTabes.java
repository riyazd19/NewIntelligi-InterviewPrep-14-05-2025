package multipleTabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.ArrayList;

public class JsExecuterMultipleTabes {
   

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        try {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            Thread.sleep(5000);

            // Open new tab using JavaScriptExecutor
            ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("window.open('https://www.google.com','_blank');");

            // Switch to the new tab
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));
            Thread.sleep(1000);
            driver.switchTo().window(tabs.get(0));

        } finally {
            Thread.sleep(5000);
            driver.quit();
        }
    }
}




