package com.automation.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelHelper {
	static String  excelpath = (".\\ExcelFiles\\AdminModule.xlsx");
	public static String readData(String path,
			String sh,int r,int c)
	{
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(path);
		} 
		catch (FileNotFoundException e) {
			System.out.println("file is not present");
		}
		Workbook wb=null;
		try {
			wb = WorkbookFactory.create(fis);
		} 
		catch (Exception e) {
			System.out.println("file format is not xlsx");
		} 
		String str=wb.getSheet(sh).getRow(r).getCell(c).getStringCellValue();	
		return str;
	}

	public static int rowCount(String path,String sh)
	{
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(path);
		} 
		catch (FileNotFoundException e) {
			System.out.println("file is not present");
		}
		Workbook wb=null;
		try {
			wb = WorkbookFactory.create(fis);
		} 
		catch (Exception e) {
			System.out.println("file format is not xlsx");
		} 
		int n=wb.getSheet(sh).getLastRowNum();	
		return n;
	}

	public static void writeData(String path,String sh,int r,int c, String d)
	{
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(path);
		} 
		catch (FileNotFoundException e) {
			System.out.println("file is not present");
		}
		Workbook wb=null;
		try {
			wb = WorkbookFactory.create(fis);
		} 
		catch (Exception e) {
			System.out.println("file format is not xlsx");
		} 
		wb.getSheet(sh).getRow(r).createCell(c).setCellValue(d);

		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream(path);
		}
		catch (FileNotFoundException e) {
			System.out.println("Please close the file");
		}

		try {
			wb.write(fos);
		} 
		catch (IOException e) {
			System.out.println("file format not xlxs");
		}
	}

	public static ArrayList<String> GetUser(String destination) throws IOException {
		ArrayList<String> excel_data=new ArrayList<>();
		File file = new File(excelpath);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(8); // sheet index
		//int row = sheet.getLastRowNum();
		int row = 44;
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

	public static void clearData(String path,String sh,int r,int c){
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(path);
		} 
		catch (FileNotFoundException e) {
			System.out.println("file is not present");
		}
		Workbook wb=null;
		try {
			wb = WorkbookFactory.create(fis);
		} 
		catch (Exception e) {
			System.out.println("file format is not xlsx");
		} 
		wb.getSheet(sh).getRow(r).getCell(c).setBlank();
	}

	public static void deleteFile(String filename) {    
		try
		{
			Files.deleteIfExists(Paths.get("C:\\Users\\"+ System.getProperty("user.name") + "\\Downloads\\"+filename+".xlsx"));
			System.out.println("Deletion successful.");
		}
		catch(NoSuchFileException e)
		{
			System.out.println("No such file/directory exists");
		}
		catch(DirectoryNotEmptyException e)
		{
			System.out.println("Directory is not empty.");
		}
		catch(IOException e)
		{
			System.out.println("Invalid permissions.");
		}
	}

}