package TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.Constants;
import PageObjectModel.LoginPage;
import PageObjectModel.commonMethod;
import Resources.BaseClass;

public class VerifyLogin extends BaseClass
{
     @Test(dataProvider="testData")
	 public void login(String Uname, String PWD) throws IOException, InterruptedException 
	 {
	commonMethod.AssertHandeling(driver.getCurrentUrl(), "https://login.salesforce.com/", "url is not matching");
	  
	  LoginPage obj=new LoginPage(driver);
	  
  
	  obj.enterUsername().sendKeys(Uname);
	  
	  obj.enterPassword().sendKeys(PWD);
	
	 obj.clickOnLogin().click();
	 
	 commonMethod.AssertHandeling(obj.Error().getText(), Constants.Err, Constants.ErMsg);
	 
	 }
     
     @DataProvider
    public Object [][] testData()
    {
    	 Object[][] data = new Object[2][2];
     data[0][0]= Constants.username1;
     data[0][1] = Constants.password1;
     data[1][0]= Constants.username2;
     data[1][1] = Constants.password2;
     return data;
     }
	
}
