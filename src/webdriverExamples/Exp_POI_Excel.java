package webdriverExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exp_POI_Excel {
	public static void main(String[] args) throws Exception{
		
		FileInputStream file = new FileInputStream("C:\\NIT_Project\\HRMS\\Excel_files\\NewExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("test");
		System.out.println(sheet.getSheetName());
		System.out.println(sheet.getLastRowNum());
		System.out.println("Before updating Cell Data : " + sheet.getRow(2).getCell(1));
		
		// Write the data to excel file
		XSSFCell cell = sheet.getRow(2).getCell(1);
		cell.setCellValue("Test123");
		file.close();
		
		FileOutputStream fileOut = new FileOutputStream("C:\\\\NIT_Project\\\\HRMS\\\\Excel_files\\\\NewExcel.xlsx");
		workbook.write(fileOut);
		System.out.println("Updated data after write is done : " + cell.getStringCellValue());
		
	}

}
