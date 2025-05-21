package com.zoho.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DashBoardPage {

@FindBy(xpath = "//a[text()='Dashboards']")
private WebElement setDashBoard;

@FindBy(xpath = "//input[@value='Add Component']")
private WebElement setAddDashBoard;

@FindBy(xpath = "//input[@id='header']")
private WebElement setcomponentname;

@FindBy(xpath = "//select[@name='srcReport']")
private WebElement setdropdown;

@FindBy(xpath = "//input[@value='Next']")
private WebElement setNext;

@FindBy(xpath = "//input[@value='Finish']")
private WebElement setFinish;

@FindBy(xpath = "//td[text()='Cricket']")
private WebElement setTextdisp;

public DashBoardPage(WebDriver driver) {
PageFactory.initElements(driver,this);
}

public void clickOnDashBoard() {
setDashBoard.click();
}

public void clickOnAddDahboard() {
setAddDashBoard.click();
}

public void addName(String name) {
setcomponentname.sendKeys(name);
}

public void clickOnDropDown() {
Select s=new Select(setdropdown);
s.selectByValue("2");
}

public void addNext() {
setNext.click();
}

public void addFinish() {
setFinish.click();
}

public String textDispOrNot() {
return setTextdisp.getText();
}

}
