package com.zoho.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage {
	
@FindBy(xpath = "//a[text()='Contacts']")
private WebElement setContactLinks;

@FindBy(xpath = "//input[@value='New Contact']")
private WebElement setAddContact;

@FindBy(xpath = "//input[@id='Account Name']")
private WebElement setAccountTbx;

@FindBy(xpath = "//input[@name='property(Last Name)']")
private WebElement setLastname;

@FindBy(xpath = "//input[@value='Save']")
private WebElement setSave;

@FindBy(xpath = "//span[text()='Rahul']")
private WebElement namedis;

public CreateContactPage(WebDriver driver) {
PageFactory.initElements(driver, this);
}

public void clickOnContactLink() {
setContactLinks.click();
}

public void clickOnNewContact() {
setAddContact.click();
}

public void addAccountName(String name) {
setAccountTbx.sendKeys(name);
}

public void addLastName(String lastname) {
setLastname.sendKeys(lastname);
}

public void clickOnSaveBtn() {
setSave.click();
}

public String nameTextisdis() {
return namedis.getText();
}
}
