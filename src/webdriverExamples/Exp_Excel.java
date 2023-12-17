package webdriverExamples;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class Exp_Excel {
	public static void main(String[] args) throws Exception{
		
		FileInputStream file = new FileInputStream("C:\\NIT_Project\\HRMS\\Excel_files\\NewExcel.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet st = wb.getSheet(0);
		int rowcount = st.getRows();
		System.out.println(rowcount);
		for(int i=1; i<=rowcount; i++) {
		String empid = st.getCell(0, i).getContents();
		String name = st.getCell(1, i).getContents();
		String email = st.getCell(2, i).getContents();
		String no = st.getCell(3, i).getContents();
		
		System.out.println(empid + "||"+name + "||" + email + "||" + no);
		}
		
		
	}

}
