package com.zoho.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewReportFolderPage {
	
@FindBy(xpath = "//a[text()='Reports']")
private WebElement setReportlink;

@FindBy(xpath = "//input[@name='newReportFolder']")
private WebElement setNewReportFolder;

@FindBy(xpath = "//input[@name='folderName']")
private WebElement setFolderName;

@FindBy(xpath = "//input[@name='folderDesc']")
private WebElement setFolderdescri;

@FindBy(xpath = "//input[@value='Save']")
private WebElement setSaveBtn;

@FindBy(xpath = "//a[text()='Test Report']")
private WebElement textdisp;

public CreateNewReportFolderPage(WebDriver driver) {
PageFactory.initElements(driver, this);
}

public void clickOnReport() {
setReportlink.click();
}

public void clickOnNewReporterFolder() {
setNewReportFolder.click();
}

public void addFolderName(String name) {
setFolderName.sendKeys(name);
}

public void addDiscription(String dis) {
setFolderdescri.sendKeys(dis);
}

public void clickOnSaveBtn() {
setSaveBtn.click();
}

public String folderDisplayedOrNot() {
	return textdisp.getText();
}
}
