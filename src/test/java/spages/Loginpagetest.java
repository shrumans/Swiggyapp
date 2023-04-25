package spages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import s_testcases.Baseclass_s;

public class Loginpagetest{

	    WebDriver driver = Baseclass_s.driver;
	    ExtentTest test=Baseclass_s.test;
	    
	    
	    public Loginpagetest() {
			PageFactory.initElements(driver, this);
		}
	
		@FindBy(linkText="Sign up")
	    WebElement signup;
		
		@FindBy(name="mobile")
	    WebElement phonenumb;
		
		@FindBy(xpath="//input[@name='name']")
	    WebElement name;
		
		@FindBy(xpath="//input[@name='email']")
	    WebElement email;
		
		@FindBy(className="a-ayg")
	    WebElement loginclk;
		
//		driver.findElement(By.linkText("Sign up")).click();
//		driver.findElement(By.name("mobile")).sendKeys("9999999990");
//		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("some");
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("some@gmail.com");
//		driver.findElement(By.className("a-ayg")).click();
		
		 public void LoginFunction(String phone,String uname,String uemail) throws InterruptedException{
			 
			 signup.click();
			 test.log(LogStatus.PASS,"signup clicked");
			 phonenumb.sendKeys(phone);
			 test.log(LogStatus.PASS,"phonenumber entered");
			 name.sendKeys(uname);
             test.log(LogStatus.PASS,"name entered");
		     email.sendKeys(uemail);
		     test.log(LogStatus.PASS, "email entered");
			 loginclk.click();
			 
			Thread.sleep(4000);
		 }
		
}
