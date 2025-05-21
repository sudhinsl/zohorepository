package com.zoho.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {

@FindBy(xpath = "//input[@value='New Account']")
private WebElement setNewAccount;

@FindBy(xpath = "//input[@name='property(Account Name)']")
private WebElement setAccountName;

@FindBy(xpath ="//input[@name='property(Phone)']")
private WebElement setPhoneNum;

@FindBy(xpath = "//input[@name='property(Website)']")
private WebElement setWebsite;

@FindBy(xpath = "//input[@value='Save']")
private WebElement setSaveBtn;

@FindBy(xpath = "//span[text()='Virat']")
private WebElement getTextName;

public CreateAccountPage(WebDriver driver) {
PageFactory.initElements(driver, this);
}

public void clickOnNewAccount() {
setNewAccount.click();
}

public void addAccountNameTbx(String name) {
setAccountName.sendKeys(name);
}
public void addPhoneNumTbx(String num) {
setPhoneNum.sendKeys(num);
}
public void addWebsite(String web) {
setWebsite.sendKeys(web);	
}
public void clickOnSaveBtn() {
setSaveBtn.click();	
}
public String nameDisplyed() {
return getTextName.getText();


}
}
