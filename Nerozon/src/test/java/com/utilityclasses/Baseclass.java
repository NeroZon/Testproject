package com.utilityclasses;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {

	public static WebDriver driver;

	public static void intilization() {

		System.setProperty("webdriver.chrome.driver",

				System.getProperty("user.dir") + "\\\\Driver\\\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://ec2-13-233-174-236.ap-south-1.compute.amazonaws.com/nerozon-backend/login");

	}

	public void Failed() {

		// File srcfile = ((TakesScreenshot).driver).getscreenshotAs(OutputType.FILE);
		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile,
					new File("C:\\Users\\Arohi\\eclipse-workspace\\Nerozon\\Screenshot\\sachin123"));

		} catch (IOException e) {

			e.getStackTrace();

		}

	}

}
