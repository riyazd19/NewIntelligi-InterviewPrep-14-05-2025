package Session_46_Listners_Extent_Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;

@Listeners(Session_46_Listners_Extent_Reports.MyListener.class)//this way also we can
// use listner and other way is to execute it from XML

public class OrangeHRMEventListner {


    static WebDriver driver;

    @BeforeClass
    public static void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Test(priority = 1)
    public void testLogo() {
        boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        Assert.assertEquals(status, true);
    }

    @Test(priority = 2)
    void testAppUrl() {
        Assert.assertEquals(driver.getCurrentUrl(), "oohttps://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test(priority = 3, dependsOnMethods = {"testAppUrl"})
    void testHomePageTitle() {
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }

    @AfterClass
    void tearDown() {
        driver.quit();
    }
}
