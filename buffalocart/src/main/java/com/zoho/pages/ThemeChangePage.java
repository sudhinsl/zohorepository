package com.zoho.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThemeChangePage {

@FindBy(xpath = "//a[text()='Skins']")
private WebElement setSettings;

@FindBy(xpath = "//form[@name='selectskin']//following::img[@alt='Balmy']")
private WebElement setTheme;

@FindBy(xpath = "//input[@name='Apply']")
private WebElement setApply;

@FindBy(xpath = "//input[@name='Close']")
private WebElement setClose;

public ThemeChangePage(WebDriver driver) {
PageFactory.initElements(driver, this);
}

public void clickOnSettings() {
setSettings.click();
}

public void clickOnTheme() {
setTheme.click();
}

public void clickOnApply() {
setApply.click();
}

public void clickOnClose() {
setClose.click();
}
}
