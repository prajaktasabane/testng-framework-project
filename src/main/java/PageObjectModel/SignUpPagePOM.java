package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SignUpPagePOM {

	public WebDriver driver;
	
	private By tryforfree=By.xpath("//a[@id='signup_link']");
	private By firstname=By.xpath("//input[@name='UserFirstName']");
	private By lastname=By.xpath("//input[@name='UserLastName']");
	private By workmail=By.xpath("//input[@name='UserEmail']");
	private By company=By.xpath("//input[@name='CompanyName']");
	private By phone=By.xpath("//input[@name='UserPhone']");
	private By country=By.xpath("//select[@name='CompanyCountry']");
	
	private By employees=By.xpath("//select[@name='CompanyEmployees']");
	private By jobtitle=By.xpath("//select[@name='UserTitle']");
	
	
	public SignUpPagePOM(WebDriver driver2) {  //constructor
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}

	public WebElement Tryforfree() {
		return driver.findElement(tryforfree);
	}
	
	public WebElement EnterFirstName() {
		return driver.findElement(firstname);
	}
	
	public WebElement EnterLastName() {
		return driver.findElement(lastname);
	}
	
	public WebElement EnterWorkMail() {
		return driver.findElement(workmail);
	}
	
	public WebElement EnterCompany() {
		return driver.findElement(company);
	}
	
	public WebElement EnterPhone() {
		return driver.findElement(phone);
	}
	
	public WebElement SelectCountry() {
		return driver.findElement(country);
	}
	
	public WebElement SelectEmployees() {
		return driver.findElement(employees);
	}
			
	public WebElement SelectJobTitle() {
		return driver.findElement(jobtitle);
	}
	
}


/*WebElement a= driver.findElement(companytitle);
Select s=new Select(a);
s.selectByValue("IT_Manager_AP");*/