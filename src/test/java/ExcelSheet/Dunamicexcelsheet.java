package ExcelSheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dunamicexcelsheet {

	public static void main(String[] args) throws IOException {
File file= new File("C:\\Automation\\SeleniumPractice\\src\\test\\java\\ExcelSheet\\Testdata\\Login Data.xlsx");
		
		FileInputStream fis =new FileInputStream(file);
		
		XSSFWorkbook workbook =new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheetAt(3);
		
		int rowcount= sheet.getPhysicalNumberOfRows();
		
		for(int i=0;i<rowcount;i++) {
			XSSFRow row= sheet.getRow(i);
			
			int cellcount=row.getPhysicalNumberOfCells();
			
			for(int j=0;j<cellcount;j++) {
				XSSFCell cell=row.getCell(j);
				
				String cellvalue= getcellvalue(cell);
				System.out.print("||"+cellvalue);
			}
			System.out.println();
		}
		

	}
	public static String getcellvalue(XSSFCell cell) {
		switch (cell.getCellType()) {
		case NUMERIC:
			return String.valueOf(cell.getNumericCellValue());
			
		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());
			
		case STRING:
			return cell.getStringCellValue();
			default:
				return cell.getStringCellValue();
				
			
		}
	}

}
