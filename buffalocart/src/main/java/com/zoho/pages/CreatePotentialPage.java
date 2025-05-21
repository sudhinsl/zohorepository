package com.zoho.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreatePotentialPage {
	public WebDriver driver;

@FindBy(xpath = "//a[text()='Potentials']")
private WebElement setpotentialLink;

@FindBy(xpath = "//input[@value='New Potential']")
private WebElement setNewPotential;

@FindBy(name = "property(Potential Name)")
private WebElement setPname;

@FindBy(xpath = "//input[@id='Account Name']")
private WebElement setAccountName;

@FindBy(xpath = "//img[@title='Calendar']")
private WebElement setCalender;

@FindBy(xpath = "//a[text()='21']")
private WebElement setDate;

@FindBy(xpath = "//a[text()='Close']")
private WebElement setclose;

@FindBy(xpath = "//select[@name='property(Stage)']")
private WebElement selectDropdownOpt;

@FindBy(xpath = "//input[@value='Save']")
private WebElement setSave;

public CreatePotentialPage(WebDriver driver) {
	this.driver=driver;
PageFactory.initElements(driver, this);
}

public void clickOnPotential() {
setpotentialLink.click();
}

public void clickOnNewPotential() {
setNewPotential.click();	
}

public void allNameTbx(String name) {
setPname.sendKeys(name);
}

public void addAccountName(String aname) {
setAccountName.sendKeys(aname);	
}

public void clickOnCalender() {
setCalender.click();
}

public void clickOnDate() {
setDate.click();
}

public void clickClose() {
setclose.click();
}

public void clickOnDropdown() throws InterruptedException {
//selectDropdownOpt.click();
	//Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(selectDropdownOpt));
Select s=new Select(selectDropdownOpt);
s.selectByVisibleText("Qualification");
}

public void clickSaveBtn() {
setSave.click();
}


}
