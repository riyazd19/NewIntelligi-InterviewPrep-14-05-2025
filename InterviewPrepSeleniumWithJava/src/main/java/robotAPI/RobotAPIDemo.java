package robotAPI;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;

public class RobotAPIDemo {
    static WebDriver driver;

    public static void main(String[] args) throws AWTException, InterruptedException {
        try {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            Robot robot = new Robot();
            Actions action = new Actions(driver);
//        action.keyDown(Keys.CONTROL);
//        action.keyDown((Keys."t"));
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress((KeyEvent.VK_T));
            robot.keyRelease((KeyEvent.VK_T));
            robot.keyRelease(KeyEvent.VK_CONTROL);
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            System.out.println(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1)); // switch to new tab
            Thread.sleep(5000);
            driver.get("https://www.google.com");
        } finally {
            Thread.sleep(5000);
            driver.quit();
        }





    }
}
