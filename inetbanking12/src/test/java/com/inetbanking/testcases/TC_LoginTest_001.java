package com.inetbanking.testcases;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.inetbanking.pageobject.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest()
	{
		driver.get(baseURL);
		LoginPage lp = new LoginPage(driver);
	        lp.setUserName(username);
	        lp.setPassWord(password);
	           
	           
	           lp.ClickSubmit();
	
	/*if (driver.getTitle().equals("Guru99 Bank Manager HomPage")) {
		
		AssertJUnit.assertTrue(true);
	} 
	else {
		AssertJUnit.assertTrue(false);
	}
*/	

}
}