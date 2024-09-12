package com.test;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class wkbkcnt {
		public static void main(String[] args) throws IOException {
			
			//1. mention the path of excel
			
			File file= new File("C:\\Users\\saran\\eclipse-workspace\\GReens\\Mvfirst\\report\\Book1.xlsx");
	        //2.read the objects/bytes from file---File iput stream class
			
			FileInputStream stream= new FileInputStream(file);
			
			//3.Mention the workbook
			
			Workbook wbook =new XSSFWorkbook(stream);
			
			//4. get the sheet name
			Sheet sheet = wbook.getSheet("sheet1");
			//5. get the row details
			 //Row row = sheet.getRow(10);
			 for(int i=0; i<sheet.getPhysicalNumberOfRows(); i++)
			 {
				 
				 Row row = sheet.getRow(i);
				 for(int j=0; j<row.getPhysicalNumberOfCells(); j++) 
				 {
					 
					 Cell cell = row.getCell(j);
					 CellType type = cell.getCellType();
					 switch(type) {
									 
					 
					 case STRING:
						 String value=cell.getStringCellValue();
						 System.out.println(value);
						 break;
					 case NUMERIC:
						 if(DateUtil.isCellDateFormatted(cell)) {
					      Date dateCellValue = cell.getDateCellValue();
					      
					      SimpleDateFormat dteformat=new SimpleDateFormat("dd-MM-yy");
					      String format=dteformat.format(dateCellValue);
					     System.out.println(format);
						 }
						 
						 else {
						 double numvalue = cell.getNumericCellValue();
						/* BigDecimal b= BigDecimal.valueOf(numvalue);
						 String num=b.toString();
						 System.out.println(num);*/						 
						 long round= Math.round(numvalue);
						 if(numvalue==round) {
							 String valueOf= String.valueOf(round);
							 System.out.println(valueOf);							
						 }
						 else { 
							 
							 String valueOf= String.valueOf(numvalue);
						 }
						 }
						 
						 
						 
						 
						 break;
						 
						
					 
					 
					 
					 }
					 
					 
					 
					 
				 }
				 
				 
			 }
			 
			 

			
		}

	}



