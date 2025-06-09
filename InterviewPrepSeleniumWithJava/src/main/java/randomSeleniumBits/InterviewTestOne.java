package randomSeleniumBits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class InterviewTestOne {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver=new ChromeDriver();
      //  driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.flipkart.com/");
        Thread.sleep(3);
        driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("Samsung");

        driver.findElement(By.xpath("//button[@type='submit']//*[name()='svg']//*[name()='g' and contains(@fill,'#2874F1')]//*[name()='path'][2]")).click();
        String name= driver.findElement(By.xpath("//div[normalize-space()='SAMSUNG Galaxy S25 Ultra 5G (Titanium Black, 512 GB)']")).getText();
    }
}
