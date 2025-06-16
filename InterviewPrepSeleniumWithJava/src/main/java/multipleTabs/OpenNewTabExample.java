package multipleTabs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class OpenNewTabExample {
    public static void main(String[] args) throws InterruptedException {
        // Setup ChromeDriver (make sure chromedriver executable is in your PATH)
        WebDriver driver = new ChromeDriver();

        try {
            // Open initial URL
            driver.get("https://www.google.com");

            // Cast driver to JavascriptExecutor
            JavascriptExecutor js = (JavascriptExecutor) driver;

            // Open a new blank tab
            js.executeScript("window.open('about:blank','_blank');");

            // Get window handles and switch to the new tab (last one)
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(tabs.size() - 1));

            // Open a URL in the new tab
            driver.get("https://www.bing.com");
            Thread.sleep(1000);
            driver.switchTo().window(tabs.get(0));
            Thread.sleep(5000);

            // You can now perform actions on the new tab

        } finally {
            // Optional: close all browser windows
            driver.quit();
        }
    }
}
