package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class commonMethod {
	
	public static void SelectDropdown(WebElement element, int index)
	{
		Select S= new Select(element);
		S.selectByIndex(index);
	}
	
	public static void AssertHandeling(String actual, String expect, String errMsg )
	{
		SoftAssert a = new SoftAssert();
		 
	 // String ac=actual;
	    
	  //String exp=expect;
	 
	     a.assertEquals(actual, expect, errMsg);
	  
	     a.assertAll();
				
	}

}
