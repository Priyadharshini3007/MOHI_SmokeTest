package com.automation.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
public static List<String> Excel_Methods = new ArrayList<String>();
public ArrayList<String> GetUser(String destination) throws IOException {
ArrayList<String> excel_data=new ArrayList<>();
File file = new File(".//TestData1.xlsx");
FileInputStream fis = new FileInputStream(file);
XSSFWorkbook wb = new XSSFWorkbook(fis);
XSSFSheet sheet = wb.getSheetAt(1);
int row = sheet.getLastRowNum();

for (int i = 1; i < row; i++) {
sheet.getRow(i).getCell(0).setCellType(CellType.STRING);
String flag = sheet.getRow(i).getCell(0).getStringCellValue();
if (flag.equalsIgnoreCase(destination)) {
int col = sheet.getRow(0).getLastCellNum();
for(int j=0;j<col;j++){
excel_data.add(sheet.getRow(i).getCell(j).getStringCellValue());
}
}
}
wb.close();
return excel_data;

}

public static void main (String args[])throws IOException {
ExcelUtils UT=new ExcelUtils();
List<String> exceldata = UT.GetUser("");
System.out.println(exceldata);
}

}