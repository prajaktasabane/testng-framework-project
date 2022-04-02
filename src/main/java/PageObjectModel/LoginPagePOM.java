package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPagePOM {
	public WebDriver driver;   //curenlly this does not have scoep
	
	private By username=By.xpath("//input[@id='username']");
	private By password=By.xpath("//input[@id='password']");
	private By Login=By.xpath("//input[@id='Login']");
	
	//driver2 took the scope from verifyLoginPage

	public LoginPagePOM(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement EnterUsername() {
		return driver.findElement(username);
	}
	
	public WebElement EnterPassword() {
		return driver.findElement(password);
	}
	
	public WebElement ClickLogin() {
		return driver.findElement(Login);
	}
	
	
	
	
	

}
/*
public WebDriver driver;  ///curenlly this does not have scoep
//Encapsulation
private By username=By.xpath("//input[@id='username']");
private By password=By.xpath("//input[@id='password']");
private By login=By.xpath("//input[@id='Login']");
//driver2 took the scope from verifyLoginPage

public LoginPagePOM(WebDriver driver2) {
	
	this.driver=driver2;
}



public WebElement EnterUSername() {

return driver.findElement(username);
}

*/