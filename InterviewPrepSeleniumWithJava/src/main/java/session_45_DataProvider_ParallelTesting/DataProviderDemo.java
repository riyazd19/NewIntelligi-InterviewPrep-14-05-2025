package session_45_DataProvider_ParallelTesting;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProviderDemo {
    WebDriver driver;

    @BeforeClass
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test(dataProvider="dp")
    void testLogin(String email,String pwd) throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("email");
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("pwd");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(2000);
        boolean status = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
        if (status == true) {
            driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
    }

    @DataProvider(name = "dp")
    Object[][] dataPropvider() {
        Object[][] data = {

                {"john.doe@example.com", "pass@456"},
                {"pavanoI123@gmail.com", "test@123"},
                {"alice.wonder@mail.com", "alice#2023"},
                {"mark.dev@domain.net", "DevMark!789"},
                {"emma.tester@test.com", "Emma@QA12"}
        };
        return data;
    }

        @AfterClass
        void tearDown () {
            driver.quit();

        }
    }
