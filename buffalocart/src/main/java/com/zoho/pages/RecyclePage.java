package com.zoho.pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RecyclePage {
	public WebDriver driver;

	@FindBy(xpath = "//a[text()='Recycle Bin']")
	private WebElement setRecyclebin;
	
	@FindBy(xpath = "//input[@onclick='selectAll()']")
	private WebElement setSelectAll;
	
	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement setDelectAll;
	
	@FindBy(xpath = "//div[text()='< No Data available >']")
	private WebElement nodata;
	
	public RecyclePage(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	public void clickOnRecycleBin() {
	setRecyclebin.click();
	}
	
	public void clickOnSelectAll() {
	setSelectAll.click();
	}
	
	public void clickOnDelectAll() throws InterruptedException {
	setDelectAll.click();
	//Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();
	 
	}
	
	public String isNoDataAvaMsg() {
		return nodata.getText();
	}
	}

