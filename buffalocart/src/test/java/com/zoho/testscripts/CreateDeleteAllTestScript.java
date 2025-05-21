package com.zoho.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.zoho.generic.BaseClass;
import com.zoho.pages.RecyclePage;

public class CreateDeleteAllTestScript extends BaseClass{

	@Test
	public void delectAll() throws InterruptedException {
	RecyclePage r=new RecyclePage(driver);
	r.clickOnRecycleBin();
	r.clickOnSelectAll();
	r.clickOnDelectAll();
    String actual = r.isNoDataAvaMsg();
    String expected="< No Data available >";
    Assert.assertEquals(actual, expected);
    
	}
}
