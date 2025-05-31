package session_37_JsExeScrollAndUploadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorClickAndSendKeys {
    static WebDriver driver;

    //https://testautomationpractice.blogspot.com/

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement inputBox=driver.findElement(By.xpath("//input[@id='name']"));
        //passing the value Alternative of SendKeys method >>
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','john')",inputBox);
        Thread.sleep(2000);
        //clicking on element with JS
        WebElement radioButton= driver.findElement(By.xpath("//input[@id='male']"));
        js.executeScript("arguments[0].click()",radioButton);
        Thread.sleep(2000);
        //Scrolling with js
        //Scrolling bar >> it is not a webElement it is OOTB


        js.executeScript("window.scrollBy(0,1500)","");// scrolling to some pixel
        System.out.println(js.executeScript("return window.pageYOffset;"));//pageYOffset y-axis
        Thread.sleep(2000);
        WebElement section3=driver.findElement(By.xpath("//h4[normalize-space()='Section 3']"));
        js.executeScript("arguments[0].scrollIntoView(true)",section3);
        Thread.sleep(2000);
        //scroll to initial
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
        System.out.println( "this is from secon scroll - "+js.executeScript("return window.pageYOffset;"));
        Thread.sleep(2000);

        //scroll till end of documen
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(2000);
        try{
            System.out.println(" just try");
        }
        finally{
            driver.quit();

        }

    }
}
