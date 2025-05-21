package com.zoho.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

@FindBy(id = "userName")
private WebElement unBtn;

@FindBy(id = "passWord")
private WebElement pwTbtn;

@FindBy(xpath = "//input[@alt='Sign In']")
private WebElement lgBttn;

public LoginPage(WebDriver driver) {
PageFactory.initElements(driver, this);	
}
public void login(String un,String pw) {
unBtn.sendKeys(un);
pwTbtn.sendKeys(pw);
lgBttn.click();

}


}
