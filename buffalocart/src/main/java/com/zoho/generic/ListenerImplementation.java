package com.zoho.generic;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenerImplementation extends BaseClass implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
	
	}
	 @Override
	public void onTestFailure(ITestResult result) {
		String name = result.getName();
		TakesScreenshot t=(TakesScreenshot) driver;
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShot/"+name+timeStamp+".png");
		try {
			FileUtils.copyFile(src, dest);
		} 
		catch (IOException e) {
			
		}
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

}
