package com.zoho.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.zoho.generic.BaseClass;
import com.zoho.pages.DashBoardPage;

public class ComponentTestScripts extends BaseClass{

@Test
public void addComponents() throws EncryptedDocumentException, IOException {
DashBoardPage d=new DashBoardPage(driver);	
String actualname=f.getExcelData("CreateComponent", 1, 0);
d.clickOnDashBoard();
d.clickOnAddDahboard();
d.addName(actualname);
d.clickOnDropDown();
d.addNext();
d.addFinish();
String expectedname=d.textDispOrNot();
Assert.assertEquals(actualname, expectedname);

}
}
