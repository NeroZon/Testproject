package com.inetbanking.testcases;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BaseClass {
	
	public String baseURL = "//http://demo.guru99.com/v4/";//https://demo.guru99.com/V4/
	public String username = "mngr164225";
	public String password = "jahetAp";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		System.setProperty("WebDriver.chrome.driver",
				System.getProperty("User.dir")+ "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
		@AfterClass
		
		public void tearDown() {
			
			//driver.quit();

}
}
