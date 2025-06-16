package takingTestDataFromExcel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class TakeInput {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        Thread.sleep(5000);
        WebElement firstName= driver.findElement(By.xpath("//input[@name='firstname']"));
        Thread.sleep(2000);
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", firstName);
        Thread.sleep(2000);
        FileInputStream fis= new FileInputStream("InterviewPrepSeleniumWithJava/TestData/TestData.xlsx");
        Workbook wb= new XSSFWorkbook(fis);
        Sheet sheet= wb.getSheetAt(0);
        for (int i=0;i<=sheet.getLastRowNum();i++) {
            Row row = sheet.getRow(i);
            String name = row.getCell(0).getStringCellValue();

            driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(name);

        }



    }
}
