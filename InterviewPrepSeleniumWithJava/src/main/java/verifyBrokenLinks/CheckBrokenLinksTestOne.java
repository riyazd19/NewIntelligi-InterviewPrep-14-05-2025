package verifyBrokenLinks;

import org.apache.commons.math3.optim.nonlinear.scalar.LineSearch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class CheckBrokenLinksTestOne {
    WebDriver driver = new ChromeDriver();
    @Test
    public void setUp(){

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
    @Test
    public void toGetLinks(){
       // driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        List<WebElement> links= driver.findElements(By.tagName("<a>"));
        System.out.println("Total number of links; - "+links.size());
    }
    @Test
    public void tearDown(){
        driver.quit();
    }
}
