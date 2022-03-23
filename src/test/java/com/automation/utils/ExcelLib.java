package com.automation.utils;


import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {
	static String Filepath="TestData1.xlsx";
	public static String getExcelData(String Sheet,int RowNUm, int ColNum) throws IOException
	{
		FileInputStream fis=new FileInputStream(Filepath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(Sheet);
		Row row=sh.getRow(RowNUm);
		
		String data=row.getCell(ColNum).getStringCellValue();
		
		return data;
	
	}

}
