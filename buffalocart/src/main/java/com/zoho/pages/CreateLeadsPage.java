package com.zoho.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadsPage {

@FindBy(xpath = "//input[@value='New Lead']")
private WebElement setNewLeads;

@FindBy(xpath = "//select[@name='property(saltName)']")
private WebElement setFirstName;

@FindBy(xpath = "//input[@name='property(Company)']")
private WebElement setCompanyName;

@FindBy(xpath = "//input[@name='property(Last Name)']")
private WebElement setLastName;

@FindBy(xpath = "//input[@value='Save']")
private WebElement setSaveBtn;

@FindBy(xpath = "//span[text()='Qspider']")
private WebElement setcompany;

public CreateLeadsPage(WebDriver driver) {
PageFactory.initElements(driver, this);
}

public void clickOnNewLeasd() {
setNewLeads.click();
}
public void addFirstName() {
Select s=new Select(setFirstName);
s.selectByValue("Mr.");
}
public void addCompanyName(String cname) {
setCompanyName.sendKeys(cname);
}

public void addLastName(String lname) {
setLastName.sendKeys(lname);
}
public void clickSaveBtn() {
setSaveBtn.click();
}

public String getNameText() {
return setcompany.getText();
}

}
