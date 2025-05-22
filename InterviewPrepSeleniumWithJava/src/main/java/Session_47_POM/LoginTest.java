package Session_47_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.time.Duration;

public class LoginTest {
    WebDriver driver;

    @BeforeClass
    void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }

    @Test
    void testLogin() {
        LoginPage lp = new LoginPage(driver);
        lp.setUserName("Admin");
        lp.setPassowrd("admin123");
        lp.clickLoginButton();
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }

    @AfterClass
    void tearDown() {
        driver.quit();
    }
}
