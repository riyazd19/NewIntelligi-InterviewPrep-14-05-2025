package randomSeleniumBits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.ArrayList;

public class TabSwitchingExample {
    public static void main(String[] args) throws InterruptedException, AWTException {

        WebDriver driver = new ChromeDriver();
        // Open first tab (default)
        driver.get("https://www.google.com");

        // Open new tab using JavaScript
        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("window.open('https://www.bing.com','_blank');");

        // Wait for tabs to open
        Thread.sleep(2000);

        // Get window handles
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabs);

        // Switch to second tab
        driver.switchTo().window(tabs.get(1));
        System.out.println("Title of 2nd tab: " + driver.getTitle());

        // Switch back to first tab
        driver.switchTo().window(tabs.get(0));
        System.out.println("Title of 1st tab: " + driver.getTitle());
        Thread.sleep(5000);

        // Close all tabs
        driver.quit();
    }
}
