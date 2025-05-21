package com.zoho.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePriceBookPage {

@FindBy(id = "property(Price Book Name)")
private WebElement priceBookTbx;

@FindBy(xpath = "//input[@value='Save']")
private WebElement saveBtn;

public CreatePriceBookPage(WebDriver drive) {
PageFactory.initElements(drive, this);
}
public void createPriceBook(String name) {
	priceBookTbx.sendKeys(name);
	saveBtn.click();
}
}
