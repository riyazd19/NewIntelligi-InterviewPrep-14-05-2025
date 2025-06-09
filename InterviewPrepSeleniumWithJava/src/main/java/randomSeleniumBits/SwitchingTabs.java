package randomSeleniumBits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class SwitchingTabs {

    static WebDriver driver;

    // static WebDriver driver2;
    public static void main(String[] args) throws AWTException, InterruptedException {
        driver = new ChromeDriver();

        driver.get("https://github.com/");
        Thread.sleep(5900);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        //driver2= new ChromeDriver();
        driver.get("https://chatgpt.com/c/6841b7fe-12a8-8011-8e0d-53f1c073c68f");
        Actions action = new Actions(driver);
       // WebElement
        action.moveToElement((WebElement) By.xpath(""));


    }
}
