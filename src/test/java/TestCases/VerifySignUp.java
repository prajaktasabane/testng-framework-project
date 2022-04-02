package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjectModel.SignUpPagePOM;
import Resources.BaseClass;
import Resources.constants;

public class VerifySignUp extends BaseClass {  //inheritance concept
	/*@BeforeMethod
	public void LaunchUrl() throws IOException {
		driver=initializeDriver();
		//driver.get("https://login.salesforce.com/");
		driver.get("https://login.salesforce.com/?locale=in");
	}*/
	
	@Test
	public void method1() throws InterruptedException {
		SignUpPagePOM obj1=new SignUpPagePOM(driver);
		obj1.Tryforfree().click();
		Thread.sleep(3000);
		obj1.EnterFirstName().sendKeys(constants.firstname);
		obj1.EnterLastName().sendKeys(constants.lastname);
		obj1.EnterWorkMail().sendKeys(constants.mail);
		obj1.EnterCompany().sendKeys(constants.company);
		obj1.EnterPhone().sendKeys(constants.phone);
		
		Select s=new Select(obj1.SelectCountry());
		s.selectByVisibleText("Italy");
		Thread.sleep(3000);
		
		Select s1=new Select(obj1.SelectEmployees());
		s1.selectByVisibleText("501 - 1500 employees");
		Thread.sleep(3000);
		
		Select s2=new Select(obj1.SelectJobTitle());
		s2.selectByVisibleText("IT Manager");
		Thread.sleep(3000);
		
	  
	   
	}

}
