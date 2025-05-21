package com.zoho.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.zoho.generic.BaseClass;
import com.zoho.pages.CreatePotentialPage;

public class PotentialTestcase extends BaseClass{
	
@Test
public void addPotential() throws EncryptedDocumentException, IOException, InterruptedException {
String name = f.getExcelData("CreatePotential", 1, 0);
String account=f.getExcelData("CreatePotential", 1, 1);
CreatePotentialPage c=new CreatePotentialPage(driver);
c.clickOnPotential();
c.clickOnNewPotential();
c.allNameTbx(name);
c.addAccountName(account);
c.clickOnCalender();
c.clickOnDate();
c.clickClose();
c.clickOnDropdown();
c.clickSaveBtn();
}
}
