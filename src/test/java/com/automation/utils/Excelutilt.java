package com.automation.utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;


import java.io.File;
import java.io.FileInputStream;


public class Excelutilt  {
	private static XSSFWorkbook wb;
	private static XSSFSheet sheet1;
    WebDriver driver;
    //public String data;
    public static  void Excelp(String excelpath) {
        try {
            File src = new File(excelpath);
            FileInputStream fis = new FileInputStream(src);
            wb = new XSSFWorkbook(fis);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static  String getData(int sheetNumber, int row, int column) {
        sheet1 = wb.getSheetAt(sheetNumber);
        String data = sheet1.getRow(row).getCell(column).getStringCellValue();
       
                
        return data;
    }

    public int getRowCount(int SheetIndex) {
        int row = wb.getSheetAt(SheetIndex).getLastRowNum();
        row = row + 1;
        return row;
    }

}

