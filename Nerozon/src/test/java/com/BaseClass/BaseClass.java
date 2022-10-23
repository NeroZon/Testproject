package com.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String url = "http://ec2-13-233-174-236.ap-south-1.compute.amazonaws.com/nerozon-backend/login";

	public String Email = "admin@nerozon.com";

	public String Password = "123456";

	public WebDriver driver;

	@BeforeClass

	public void setup() {

		System.setProperty("webdriver.chrome.driver",
		System.getProperty("user.dir") + "\\\\Driver\\\\chromedriver.exe");

		driver = new ChromeDriver();

	}

	@AfterClass
	public void Teardown() {

		// driver.quit();

	}
}
