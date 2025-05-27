package session_45_DataProvider_ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;
//This testcase wont work by its own you need to have its xml and provide valid parameters
// as browser as the setUp method is asking for parameters

public class ParamTest {
    WebDriver driver;

    @BeforeClass
    @Parameters({"browser"})
    void setUp(String br) {
        switch (br){
            case "chrome": driver = new ChromeDriver(); break;
            case "edge": driver=new EdgeDriver();
            case "firefox": driver=new FirefoxDriver();
            default:
                System.out.println("invalid browser"); return;
        }





        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    void testLogo() {
        boolean status = driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']")).isDisplayed();
        Assert.assertTrue(status);
    }

    @Test(priority = 2)
    void testTitle() {
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }

    @Test(priority = 3)
    void testUrl() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterClass
    void tearDown() {
        driver.quit();
    }
}
