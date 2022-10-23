package com.utilityclasses;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustemListner.class)
public class ScreenshotTest extends Baseclass {

	@BeforeMethod
	public void setup() {

		intilization();

	}

	@AfterMethod
	public void Teardown() {

		driver.quit();

	}

	@Test
	public void TakesScreenshot() {

		Assert.assertEquals(false, true);

	}

}
