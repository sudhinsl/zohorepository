package com.zoho.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.zoho.generic.BaseClass;
import com.zoho.pages.CreateProductPage;

public class ProductPage extends BaseClass{

	@Test
	public void addProduct() throws EncryptedDocumentException, IOException {
	String actualproductname=f.getExcelData("CreateProduct", 1, 0);
	String code=f.getExcelData("CreateProduct", 1, 1);
	CreateProductPage c=new CreateProductPage(driver);
	c.clickOnProduct();
	c.clickNewProduct();
	c.addProductName(actualproductname);
	c.addProductCode(code);
	c.clickSaveBtn();
	String expectedname=c.textDispOrNot();
	Assert.assertEquals(expectedname, actualproductname);
	
	}
}
