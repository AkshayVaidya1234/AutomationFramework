package SeleniumPractice.SeleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


//EXCEL-->Workbook-->Sheet-->Row-->Cell

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\TestData\\Excel.xlsx");
		
		XSSFWorkbook workbbok=new XSSFWorkbook(fis);
		XSSFSheet shhet =workbbok.getSheet("Sheet1");
		
		int totalcount=shhet.getLastRowNum();
		int total_cell=shhet.getRow(0).getLastCellNum();
		
		System.out.println("total sheet:"+totalcount);
		System.out.println("totalcell:"+total_cell);
		
		
		for(int r=0;r<=totalcount;r++) {
	XSSFRow	current_row=	shhet.getRow(r);
		
		for(int c=0;c<total_cell;c++) {
			XSSFCell cell=current_row.getCell(c);
			System.out.print(cell.toString()+ "\t");
		}
		System.out.println();
	}
		workbbok.close();
		fis.close();
		

}
}