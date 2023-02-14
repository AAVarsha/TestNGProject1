package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPage;
import PageObjectModel.SignUp;
import PageObjectModel.commonMethod;
import Resources.BaseClass;

public class VerifySinUp extends BaseClass

{
@Test
	public void Sinup () throws IOException, InterruptedException
	{
		  
		LoginPage obj= new LoginPage(driver);
		obj.clickOntryForFree().click();
		
		SignUp obj1 = new SignUp(driver);
		Thread.sleep(4000);
		obj1.FirstName().sendKeys("Varsha");
		obj1.LastName().sendKeys("Shinde");
		obj1.Email().sendKeys("nirmal.v30@gmail.com");
		commonMethod.SelectDropdown(obj1.Company(), 1);
		commonMethod.SelectDropdown(obj1.JobTitle(), 2);
	Thread.sleep(1000);
		
	}

	
}
