package com.zoho.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.zoho.generic.BaseClass;
import com.zoho.pages.CreatePriceBookPage;
import com.zoho.pages.HomePage;
import com.zoho.pages.PriceBookDetailsPage;
import com.zoho.pages.PriceBookPage;

public class PriceBookTestScripts extends BaseClass{

@Test
public void createPriceBook()throws EncryptedDocumentException, IOException {
	String expectedBookName = f.getExcelData("CreatePriceBook", 1, 0);
	HomePage h=new HomePage(driver);
	WebElement priceBooks = h.clickOnPriceBook();
	for(;;) {
		if(priceBooks.isDisplayed()) {
			priceBooks.click();
			break;
		}else {
			h.clickOnScrollBtn();		}	}
	PriceBookPage p=new PriceBookPage(driver);
	p.ClickOnNewPriceBookBtn();
	CreatePriceBookPage c=new CreatePriceBookPage(driver);
	c.createPriceBook(expectedBookName);
	PriceBookDetailsPage d=new PriceBookDetailsPage(driver);
	String actualBookName =d.getPriceBookDetails();
	Assert.assertEquals(actualBookName, expectedBookName);
}
}
