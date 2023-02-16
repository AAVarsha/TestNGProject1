package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUp {

	public WebDriver driver;
	private By FirstName = By.xpath("//input[@name='UserFirstName']");
	private By LastName = By.xpath("//input[@name='UserLastName']");
	private By Company = By.xpath("//select[@name='CompanyEmployees']");
	private By Email = By.xpath("//input[@name='UserEmail']");
	private By Job= By.xpath("//select[@name='UserTitle']");
	private By Country = By.xpath("//select[@name='CompanyCountry'");
	public SignUp(WebDriver driver2)
	{
		this.driver = driver2;    
		
	}
	
	public WebElement FirstName()
	{
		return driver.findElement(FirstName);
	}
	
	public WebElement LastName()
	{
		return driver.findElement(LastName);
	}
	public WebElement Company()
	{
		return driver.findElement(Company);
	}
	public WebElement Email()
	{
		return driver.findElement(Email);
	}
	public WebElement JobTitle()
	{
		return driver.findElement(Job);
	}
public WebElement country()
{
	return driver.findElement(Company);
	
}
}

