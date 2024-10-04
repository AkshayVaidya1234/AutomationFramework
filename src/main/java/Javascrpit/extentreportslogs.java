package Javascrpit;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import net.bytebuddy.implementation.bytecode.Throw;

public class extentreportslogs {

	public static void main(String[] args) throws IOException {
		ExtentReports ex= new ExtentReports();
		File fis= new File("C:\\\\Automation\\\\SeleniumPractice\\\\Reports.html");
		ExtentSparkReporter spark= new ExtentSparkReporter(fis);
		ex.attachReporter(spark);
		
	ExtentTest test1=	ex.createTest("Text based Test")
    .log(Status.INFO, "this is info")
    .log(Status.INFO, "<b>this is info</b>")
    .log(Status.SKIP, "<i>this is skip</i>")
    .log(Status.INFO, "<b><i>this is info</b></i>");
	
	
	String xmlData="<menu id=\"file\" value=\"File\">\r\n"
			+ "  <popup>\r\n"
			+ "    <menuitem value=\"New\" onclick=\"CreateNewDoc()\" />\r\n"
			+ "    <menuitem value=\"Open\" onclick=\"OpenDoc()\" />\r\n"
			+ "    <menuitem value=\"Close\" onclick=\"CloseDoc()\" />\r\n"
			+ "  </popup>\r\n"
			+ "</menu>\r\n"
			+ "";
	
	String jasonData="{\"menu\": {\r\n"
			+ "  \"id\": \"file\",\r\n"
			+ "  \"value\": \"File\",\r\n"
			+ "  \"popup\": {\r\n"
			+ "    \"menuitem\": [\r\n"
			+ "      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\r\n"
			+ "      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\r\n"
			+ "      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\r\n"
			+ "    ]\r\n"
			+ "  }\r\n"
			+ "}}";
	
		ex.createTest("XML based data")
	         .info(MarkupHelper.createCodeBlock(xmlData, CodeLanguage.XML));    
			
			
		ex.createTest("json based data")
        .log(Status.INFO, MarkupHelper.createCodeBlock(jasonData, CodeLanguage.JSON));
		
		
		List <String> li =new ArrayList();
		li.add("Akshay");
		li.add("Bhmpyaa");
		li.add("Nikhil");
		
		
	Map<Integer, String>mp=new HashMap();
	mp.put(101, "Akshay");
	mp.put(102,"Bhmpyaa");
	mp.put(103, "Dhanu");
	
	Set<Integer> se=mp.keySet();
	
	ex.createTest("List based data")
	.info(MarkupHelper.createOrderedList(li))
	.info(MarkupHelper.createUnorderedList(li));
	
	ex.createTest("map based data")
	.info(MarkupHelper.createOrderedList(mp))
	.info(MarkupHelper.createUnorderedList(mp));
	
	ex.createTest("List based data")
	.info(MarkupHelper.createOrderedList(se))
	.info(MarkupHelper.createUnorderedList(se));
	
	
	ex.createTest("Highlited text")
	.info("This is not highlited")
	.info(MarkupHelper.createLabel("This is highlited msg", ExtentColor.RED));
		
		try {
			int i= 5/0;
		}
		
		catch(Exception e)
		{
			ex.createTest("Exception test1")
			.fail(e);
		}
		
		Throwable t= new RuntimeException("this runtime exception");
		ex.createTest("Exception test2")
		.fail(t);
		
	
	
	ex.flush();
	Desktop.getDesktop().browse(new File("Reports.html").toURI());
	}

}
