package s_testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class Baseclass_s {

	//ExcelTestData
	XSSFWorkbook wbook;
	XSSFSheet sheet;
	
	//Extentreport customized
	public static ExtentReports report;
	public static ExtentTest test;
	
	@BeforeTest
	public void testdata() throws IOException{
		FileInputStream file=new FileInputStream("Sexcel.xlsx");
		wbook=new XSSFWorkbook(file);
		sheet=wbook.getSheet("Sheet1");
		
		report= new ExtentReports("Extentreportfile.html");
	}
	
	@AfterTest
	public void dataclose() throws IOException{
		wbook.close();
		
		report.flush();
		report.close();
	}
	
	
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		System.out.println("Before executed");
		System.setProperty("webdriver.chrome.driver", "chromedriver1.exe");
		driver=new ChromeDriver();
		driver.get("https://www.swiggy.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void quitbrowser() {
		System.out.println("after executed");
		driver.quit();
		
	}
	
	
}
