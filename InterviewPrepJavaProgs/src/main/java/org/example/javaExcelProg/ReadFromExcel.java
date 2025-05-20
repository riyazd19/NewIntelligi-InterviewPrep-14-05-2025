package org.example.javaExcelProg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadFromExcel {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "D:\\InterviewPrepIntelligi\\NewIntelligi-InterviewPrep-14-05-2025\\InterviewPrepJavaProgs\\ExcelFiles\\Countries_Data.xlsx";
        FileInputStream fn= new FileInputStream(filePath);
    }
}
