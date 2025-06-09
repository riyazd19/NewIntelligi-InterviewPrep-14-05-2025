package multipleTabs;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MultipleWindowsFindingTheRightOne {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
     try {
         driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.manage().window().maximize();
         driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.linkText("//https://www.facebook.com/OrangeHRM")).click();
        Thread.sleep(10);

         Set<String> setWindowHandles = driver.getWindowHandles();
         List<String> tabsList = new ArrayList<String>(setWindowHandles);
         System.out.println(tabsList);
     }
     finally {
         driver.quit();
     }


    }

}
