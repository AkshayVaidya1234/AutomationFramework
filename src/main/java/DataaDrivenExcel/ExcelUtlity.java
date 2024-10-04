package DataaDrivenExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtlity {
	
public static FileInputStream fis;
public static FileOutputStream fio;
public static XSSFWorkbook wb;
public static XSSFSheet sheet;
public static XSSFRow row;
public static XSSFCell cell;
public static XSSFCellStyle style;

public static int rowcount(String Xlfile,String xlsheet) throws IOException {
	fis=new FileInputStream(Xlfile);
	wb=new XSSFWorkbook(fis);
	sheet=wb.getSheet(xlsheet);
	int rowcount=sheet.getLastRowNum();
	fis.close();
	wb.close();
	return rowcount;
	
}
public static int cellcount(String Xlfile,String xlsheet,int rownum) throws IOException {
	fis=new FileInputStream(Xlfile);
	wb=new XSSFWorkbook(fis);
	sheet=wb.getSheet(xlsheet);
	row=sheet.getRow(rownum);
	int cellcount=row.getLastCellNum();
	fis.close();
	wb.close();
	return cellcount;
}

public static String getcelldata(String Xlfile,String xlsheet,int rownum,int columnno) throws IOException {
	fis=new FileInputStream(Xlfile);
	wb=new XSSFWorkbook(fis);
	sheet=wb.getSheet(xlsheet);
	row=sheet.getRow(rownum);
	cell=row.createCell(columnno);
	
	String data;
	try {
		data=cell.toString();
	}
	catch(Exception e) {
		data="";
	}
	wb.close();
	fis.close();
	return data;
}


public static void Celldata(String Xlfile,String xlsheet,int rownum,int columnno,String Data) throws IOException {
	fis=new FileInputStream(Xlfile);
	wb=new XSSFWorkbook(fis);
	sheet=wb.getSheet(xlsheet);
	row=sheet.getRow(rownum);
	cell=row.createCell(columnno);
	cell.setCellValue(Data);
	fio=new FileOutputStream(Xlfile);
	wb.write(fio);
	wb.close();
	fis.close();
	fio.close();
	
	
	
}




}
