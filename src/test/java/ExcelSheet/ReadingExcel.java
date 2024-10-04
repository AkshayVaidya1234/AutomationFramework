package ExcelSheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		File file= new File("C:\\Automation\\SeleniumPractice\\src\\test\\java\\ExcelSheet\\Testdata\\Login Data.xlsx");
		
		FileInputStream fis =new FileInputStream(file);
		
		XSSFWorkbook workbook =new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheetAt(2);
		
		String cellvalue= sheet.getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(cellvalue);
		
		

	}

}
