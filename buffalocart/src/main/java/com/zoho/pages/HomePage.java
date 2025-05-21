package com.zoho.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

@FindBy(xpath = "//div[@id='tabcontainer']/descendant::a[text()='Price Books']")
private WebElement priceBookLink;

@FindBy(id = "scrollright")
private WebElement scrollRightBtn;

@FindBy(linkText = "Accounts")
private WebElement clickAccountLink;

@FindBy(xpath = "//a[text()='Leads']")
private WebElement setLeads;
	
@FindBy(xpath  = "//a[text()='Logout [rashmi@dell.com]']")
private WebElement logBtn;

public HomePage(WebDriver driver) {
PageFactory.initElements(driver, this);
}

public WebElement clickOnPriceBook() {
priceBookLink.click();
return logBtn;
}

public void clickOnScrollBtn() {
scrollRightBtn.click();
}

public void clickOnAccountLink() {
clickAccountLink.click();	
}

public void clickOnLeadsLinks() {
setLeads.click();
}

public void logout() {
logBtn.click();
}
}
