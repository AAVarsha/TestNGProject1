package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	
	private By username = By.xpath("//input[@id='username']");
	private By password =By.xpath("//input[@id='password']");
	private By login =By.xpath("//input[@id='Login']");
	private By tryForFree =By.xpath("//a[@id='signup_link']");
	private By errorMessage = By.xpath("(//div[@class='loginError'])[2]");
	
	public LoginPage(WebDriver driver2) {
		 
		  this.driver=driver2;
		  
		 }

		 public WebElement enterUsername() {
		  return driver.findElement(username);
		  
		 }		 
		 
		 public WebElement enterPassword() {
		  return driver.findElement(password);
		  
		 }
		 public WebElement  clickOnLogin() {
		  return driver.findElement(login);
		  
		 }
		 
		public WebElement clickOntryForFree() {
			// TODO Auto-generated method stub
			 return driver.findElement(tryForFree);
		}

		public WebElement Error()
		{
			return driver.findElement(errorMessage);															
		}
}
