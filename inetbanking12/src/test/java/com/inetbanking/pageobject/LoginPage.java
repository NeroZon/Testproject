/**
 * 
 */
package com.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetbanking.testcases.BaseClass;

/**
 * @author Arohi
 *
 */
public class LoginPage extends BaseClass {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "uid")
	@CacheLookup
	WebElement txtUserName;

	@FindBy(name = "password")
	@CacheLookup
	WebElement txtpassword;

	@FindBy(name = "btnLogin")
	@CacheLookup
	WebElement btnLogin;

	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
	}

	public void setPassWord(String pwd) {
		txtUserName.sendKeys(pwd);
	}

	public void ClickSubmit() {

		btnLogin.click();
	}

}
