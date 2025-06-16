package takingTestDataFromExcel;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CommonClassForExcelLocation {

    public static void testData() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\InterviewPrepIntelligi\\NewIntelligi-InterviewPrep-14-05-2025\\InterviewPrepSeleniumWithJava\\TestData\\TestData.xlsx");
        Workbook workbook= new XSSFWorkbook(fis);

        Sheet sheet= workbook.getSheetAt(0);
    }
}
