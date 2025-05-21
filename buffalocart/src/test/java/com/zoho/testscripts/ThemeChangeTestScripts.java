package com.zoho.testscripts;

import org.testng.annotations.Test;

import com.zoho.generic.BaseClass;
import com.zoho.pages.ThemeChangePage;

public class ThemeChangeTestScripts extends BaseClass{
@Test
public void setTheme() {

ThemeChangePage t=new ThemeChangePage(driver);
t.clickOnSettings();
t.clickOnTheme();
t.clickOnApply();
t.clickOnClose();
}
}
