package com.zoho.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CraeteSolution {
	public WebDriver driver;

@FindBy(xpath = "//div[@id='tabcontainer']/descendant::a[text()='Solutions']")
private WebElement setSolutionLink;

@FindBy(id = "scrollright")
private WebElement setScroll;

@FindBy(xpath = "//input[@onclick='createAction()']")
private WebElement setNewSolution;

@FindBy(xpath = "//input[@name='property(Solution Title)']")
private WebElement setSolutionTitle;

@FindBy(xpath = "//textarea[@name='property(Question)']")
private WebElement setQues;

@FindBy(xpath = "//textarea[@name='property(Answer)']")
private WebElement setAns;

@FindBy(xpath = "//input[@value='Save']")
private WebElement setSaveBtn;

@FindBy(xpath = "//span[text()='Iam Fine']")
private WebElement setSolutionTitleDisp;

public CraeteSolution(WebDriver driver) {
	this.driver=driver;
PageFactory.initElements(driver,this);
}

public WebElement clickOnSolution() {
	return setSolutionLink;
 
}

public WebElement clickOnScroll() {
return setScroll;
}

public void addNewSolution() {
setNewSolution.click();
}

public void addSolutionTile(String title) {
setSolutionTitle.sendKeys(title);
}

public void addQuestion(String ques) {
setQues.sendKeys(ques);
}

public void addAnswer(String ans) {
setAns.sendKeys(ans);
}

public void clickOnSaveBtn() {
setSaveBtn.click();
}

public String textDispOrNot() {
return setSolutionTitleDisp.getText();
}
}

