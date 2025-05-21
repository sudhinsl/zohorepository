package com.zoho.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.zoho.generic.BaseClass;
import com.zoho.pages.CreateContactPage;

public class Contacts extends BaseClass {

@Test
public void addContact() throws EncryptedDocumentException, IOException {
String actualname = f.getExcelData("CreateContact", 1, 0);
String lname=f.getExcelData("CreateContact", 1, 1);
CreateContactPage c=new CreateContactPage(driver);
c.clickOnContactLink();
c.clickOnNewContact();
c.addAccountName(actualname);
c.addLastName(lname);
c.clickOnSaveBtn();
String expectedname=c.nameTextisdis();
Assert.assertEquals(expectedname, actualname);
}
}
