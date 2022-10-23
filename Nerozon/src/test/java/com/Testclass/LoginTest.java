package com.Testclass;

import org.testng.annotations.Test;

import com.BaseClass.BaseClass;

import Com.pageobject.loginpage;

public class LoginTest extends BaseClass {

	@Test

	public void loginTest() {

		driver.get(url);
		loginpage l = new loginpage(driver);
		l.setusername(Email);
		l.setPassword(Password);
		l.setCheckbox();
		l.ClickonLogin();
		System.out.println( driver.getTitle());
		
	}
	
	
	//public void verifytitle() {
		
		//String ExpectedTitle = "";
		
		
	//}
		
		
		
		
	
}
