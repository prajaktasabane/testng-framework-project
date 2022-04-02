package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.LoginPagePOM;
import Resources.BaseClass;
import Resources.constants;

public class VerifyLogin extends BaseClass {
	/*@BeforeMethod
	public void urlLAunch() throws IOException {
		
		driver=initializeDriver();  //This driver have scope
		driver.get("https://login.salesforce.com/");
	
	}*/
	
	@Test(dataProvider="demo")
	public void entercredentials(String username,String password)
	{
		LoginPagePOM obj=new LoginPagePOM(driver);
		obj.EnterUsername().sendKeys(username);
		obj.EnterPassword().sendKeys(password);
		obj.ClickLogin().click();
		
	}
	
	    @DataProvider
		public Object[][] demo(){
			
			Object[][] data=new Object[2][2];
			
			//correct username and password
			data[0][0]=constants.username1;    //"test1";  
			data[0][1]=constants.password1;    // "Secure123";

			//incorrect username and password
			data[1][0]=constants.username2;    //"test2";
			data[1][1]=constants.password2;    //"Secure456";

			return data;
			
		}
}


/*
//verifyloginpage
@BeforeMethod
public void urlLAunch() throws IOException {
	
	driver=initializeDriver(); //This driver have scope
	driver.get("https://login.salesforce.com/");
	

}
@Test
public void enterCredentials(){
	
	 LoginPagePOM obj= new LoginPagePOM (driver);
	 obj.EnterUSername().sendKeys("hhjhjs");
	 obj.EnterPassword().sendKeys("jhjd");
	 obj.clickLogin().click();
	
	 
}*/