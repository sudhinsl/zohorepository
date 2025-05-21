package com.zoho.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.zoho.generic.BaseClass;
import com.zoho.pages.CraeteSolution;

public class SolutionTestScripts extends BaseClass{

	@Test
	public void addSolution() throws EncryptedDocumentException, IOException {
	String actualtitle= f.getExcelData("CreateSolution", 1, 0);
	String qus=f.getExcelData("CreateSolution", 1, 2);
	String ans=f.getExcelData("CreateSolution", 1, 3);
	CraeteSolution c=new CraeteSolution(driver);
	WebElement solution= c.clickOnSolution();
	for(;;) {
	if(solution.isDisplayed()) {
		solution.click();
		break;
	}else {
	 c.clickOnScroll();}}
	 c.addNewSolution();
	 c.addSolutionTile(actualtitle);
	 c.addQuestion(qus);
	 c.addAnswer(ans);
	 c.clickOnSaveBtn();
	 String expectedtitle=c.textDispOrNot();
	 Assert.assertEquals(actualtitle, expectedtitle);
	
	
	
	
	
		}
	}

