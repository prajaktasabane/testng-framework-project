package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	Properties prop;
	
public WebDriver initializeDriver() throws IOException {
		
		prop=new Properties();
		//FileInputStream fis=new FileInputStream("C:\\Users\\MY PC\\eclipse-workspace\\SeleniumTesNGprogect\\src\\main\\java\\Resources\\data.properties");
													//data.properties cha path
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
		   //System.setProperty("webdriver.chrome.driver","C:\\Users\\MY PC\\Desktop\\selenium data\\chromedriver_win32\\chromedriver.exe");
		   driver = new ChromeDriver();
			
		}else if(browserName.equals("firefox")) {
			
			//Firefox code
			
		}
          else if(browserName.equals("IE")) {
        	  //IE code
			
		}
          else {
        	  System.out.println("please select any browser");
          }
		return driver;
		
	}
	
@BeforeMethod
public void urlLAunch() throws IOException {
	
	driver=initializeDriver();  //This driver have scope
	//driver.get("https://login.salesforce.com/");
	driver.get(prop.getProperty("url"));
	driver.manage().window().maximize();

}

}


