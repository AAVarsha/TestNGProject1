package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public WebDriver driver;
	public Properties porp;
	public void driverInitialization() throws IOException
	{
		//read properties file
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
	
		porp = new Properties();   //access properties file
		porp.load(fs);
		String BrowserName = porp.getProperty("browser");
		
		if(BrowserName.equalsIgnoreCase("chrome"))
		{
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			
		}
		
		else if(BrowserName.equalsIgnoreCase("firefox"))
		{
			 driver = new FirefoxDriver();
			
		}
		else
		{
			 System.out.println("no browser");
			
		}
	}	
	@BeforeMethod
		public void geturl() throws IOException
		
		{
		driverInitialization();
		    String URL = porp.getProperty("url");
			driver.get(URL);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}

}

