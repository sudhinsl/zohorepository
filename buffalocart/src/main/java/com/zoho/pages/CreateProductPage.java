package com.zoho.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProductPage {

@FindBy(xpath = "//a[text()='Products']")
private WebElement setProductLinks;

@FindBy(xpath = "//input[@value='New Product']")
private WebElement setNewProduct;

@FindBy(xpath = "//input[@name='property(Product Name)']")
private WebElement setProductName;

@FindBy(xpath = "//input[@name='property(Product Code)']")
private WebElement setProductCode;

@FindBy(xpath = "//input[@value='Save']")
private WebElement setSaveBtn;

@FindBy(xpath = "//span[text()='Bat']")
private WebElement setText;

public CreateProductPage(WebDriver driver) {
PageFactory.initElements(driver,this);
}

public void clickOnProduct() {
setProductLinks.click();
}

public void clickNewProduct() {
setNewProduct.click();
}

public void addProductName(String name) {
setProductName.sendKeys(name);
}

public void addProductCode(String code) {
setProductCode.sendKeys(code);
}

public void clickSaveBtn() {
setSaveBtn.click();
}

public String textDispOrNot() {
return setText.getText();
}
}
