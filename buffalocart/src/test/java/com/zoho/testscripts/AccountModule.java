package com.zoho.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.zoho.generic.BaseClass;
import com.zoho.generic.FileLib;
import com.zoho.pages.CreateAccountPage;
import com.zoho.pages.HomePage;

public class AccountModule extends BaseClass{

	@Test
	public void createAcount() throws EncryptedDocumentException, IOException {
	FileLib f=new FileLib();
	String actualname=f.getExcelData("CreateAccount", 1, 0);
	String phonenum=f.getExcelData("CreateAccount", 1, 1);
	String website=f.getExcelData("CreateAccount", 1, 2);
	HomePage h=new HomePage(driver);
	h.clickOnAccountLink();
	CreateAccountPage c=new CreateAccountPage(driver);
	c.clickOnNewAccount();
	c.addAccountNameTbx(actualname);
	c.addPhoneNumTbx(phonenum);
	c.addWebsite(website);
	c.clickOnSaveBtn();
    String expectedname = c.nameDisplyed();
    Assert.assertEquals(expectedname, actualname);
   
	
	}
}
