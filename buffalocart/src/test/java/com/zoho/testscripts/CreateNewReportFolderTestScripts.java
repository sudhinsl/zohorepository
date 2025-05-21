package com.zoho.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.zoho.generic.BaseClass;
import com.zoho.pages.CreateNewReportFolderPage;

public class CreateNewReportFolderTestScripts extends BaseClass{
@Test
public void addNewFolder() throws EncryptedDocumentException, IOException {
String actualname=f.getExcelData("CreateFolder", 1, 0);
String dis=f.getExcelData("CreateFolder", 1, 1);
CreateNewReportFolderPage c=new CreateNewReportFolderPage(driver);
c.clickOnReport();
c.clickOnNewReporterFolder();
c.addFolderName(actualname);
c.addDiscription(dis);
c.clickOnSaveBtn();
String expectedname=c.folderDisplayedOrNot();
Assert.assertEquals(actualname, expectedname);
}
}
