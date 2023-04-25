package s_testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import spages.Loginpagetest;

@Listeners(listener.Listenerclass.class)


public class Logintest_s extends Baseclass_s{

	
	@Test
	public void AssertLogin() throws InterruptedException {
		
		test=report.startTest("Assertlogin");
		
		Loginpagetest login= new Loginpagetest();
		login.LoginFunction("9090909090", "shruthi", "manjesh@gmail.com");
		
		WebElement errorelement = driver.findElement(By.xpath("//div[@class='_3--N8']"));
		System.out.println("Errormessage: "+errorelement.getText());
		String act= errorelement.getText();
		String exp="Mobile number already exists";
		Assert.assertEquals(act, exp);
		
		report.endTest(test);
	}
	
	@Test
	public void SuccessLogin() throws InterruptedException {
		
		test=report.startTest("SuccessLogin");
		
		Loginpagetest login1= new Loginpagetest();
		login1.LoginFunction("9999999990", "shruthimanjesh", "shruthi@gmail.com");
		
		report.endTest(test);
	}
	
	
	@Test
	public void DatafromExcel() throws InterruptedException{
		
		test=report.startTest("DatafromExcel");
		
		String Userphone = sheet.getRow(1).getCell(0).getStringCellValue();
		String Username = sheet.getRow(1).getCell(1).getStringCellValue();
		String Usermailid = sheet.getRow(1).getCell(2).getStringCellValue();
		Loginpagetest login2= new Loginpagetest();
		login2.LoginFunction(Userphone, Username, Usermailid);
		
		report.endTest(test);
	}
}


