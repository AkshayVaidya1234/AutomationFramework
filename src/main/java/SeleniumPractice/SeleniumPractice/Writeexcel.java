package SeleniumPractice.SeleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writeexcel {

	public static void main(String[] args) throws IOException {
FileOutputStream fis= new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\Akshay.xlsx");
		
		XSSFWorkbook workbbok=new XSSFWorkbook();
		XSSFSheet sheet=workbbok.createSheet("Data");
		
		XSSFRow row=sheet.createRow(0);
		row.createCell(0).setCellValue("Java");
		row.createCell(1).setCellValue("19");
		row.createCell(2).setCellValue("Automation");
		

		XSSFRow row1=sheet.createRow(1);
		row.createCell(0).setCellValue("Phython");
		row.createCell(1).setCellValue("12");
		row.createCell(2).setCellValue("Automation");
		
		XSSFRow row2=sheet.createRow(2);
		row.createCell(0).setCellValue("C++");
		row.createCell(1).setCellValue("12");
		row.createCell(2).setCellValue("Automation");
		
		workbbok.write(fis);
		workbbok.close();
		fis.close();
		
		System.out.println("File is created");
		
		
		

	}

}
