package com.zoho.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PriceBookDetailsPage {

	@FindBy(id = "value_Price Book Name")
	private WebElement createPriceBook;
	
public PriceBookDetailsPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public String getPriceBookDetails() {
return createPriceBook.getText();
}
}