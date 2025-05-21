package com.zoho.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PriceBookPage {

@FindBy(xpath = "//input[@onclick='createAction()']")
private WebElement setOnNewPriceBookBtn;

public PriceBookPage(WebDriver driver) {
PageFactory.initElements(driver, this);
}

public void ClickOnNewPriceBookBtn() {
setOnNewPriceBookBtn.click();
}
}
