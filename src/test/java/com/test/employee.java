package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class employee {
	
	public static void main(String[] args) throws IOException {
		
		//1. mention the path of excel
		
		File file= new File("C:\\Users\\saran\\eclipse-workspace\\GReens\\Mvfirst\\report\\Book1.xlsx");
        //2.read the objects/bytes from file---File iput stream class
		
		FileInputStream stream= new FileInputStream(file);
		
		//3.Mention the workbook
		
		Workbook wbook =new XSSFWorkbook(stream);
		
		//4. get the sheet name
		Sheet sheet = wbook.getSheet("Login");
		//5. get the row details
		 Row row = sheet.getRow(2); 
		 
		 //6. Get the cell
		 Cell cell = row.getCell(1);
		 System.out.println(cell);
	

		
	}

}
