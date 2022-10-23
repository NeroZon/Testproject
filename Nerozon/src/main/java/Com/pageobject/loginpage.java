package Com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	WebDriver driver;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement Password;

	@FindBy(className = "aiz-square-check")
	private WebElement Remeberme;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginbtn;

	public loginpage(WebDriver driver)

	{
		PageFactory.initElements(driver, this);
	}

	public void setusername(String User) {
		username.sendKeys(User);
	}

	public void setPassword(String PWD) {
		Password.sendKeys(PWD);
	}

	public void setCheckbox()

	{
		Remeberme.click();
	}

	public void ClickonLogin() {

		loginbtn.click();
	}

}
