package com.utilityclasses;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustemListner extends Baseclass implements ITestListener {

	@Override
	public void onTestStart(ITestResult Result) {

	}

	@Override
	public void onTestSuccess(ITestResult Result) {

	}

	@Override
	public void onTestFailure(ITestResult Result) {

		System.out.println("failed test cases");

		Failed();

	}

	@Override
	public void onTestSkipped(ITestResult Result) {

	}

}
