package com.zoho.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.zoho.generic.BaseClass;
import com.zoho.pages.CreateLeadsPage;
import com.zoho.pages.HomePage;

public class LeadTestScripts extends BaseClass{

@Test
public void createLeads() throws EncryptedDocumentException, IOException {
String expectedcompany=f.getExcelData("CreateLead", 1, 0);
String name=f.getExcelData("CreateLead", 1, 1);
HomePage h=new HomePage(driver);
h.clickOnLeadsLinks();
CreateLeadsPage c=new CreateLeadsPage(driver);
c.clickOnNewLeasd();
c.addFirstName();
c.addCompanyName(expectedcompany);
c.addLastName(name);
c.clickSaveBtn();
String actualname=c.getNameText();
Assert.assertEquals(expectedcompany, actualname);
}
}
