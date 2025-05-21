package com.zoho.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.zoho.pages.HomePage;
import com.zoho.pages.LoginPage;

public class BaseClass {
public FileLib f =new FileLib();
public WebDriver driver;

@BeforeTest
public void openBrowser() throws InterruptedException {
	driver=new EdgeDriver();
	Thread.sleep(3000);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}
@AfterTest
public void closeBrowser() {
	driver.quit();
}
@BeforeMethod
public void login() throws IOException {
String url=f.getPropertyData("url");
driver.get(url);
String un=f.getPropertyData("username");
String pw=f.getPropertyData("password");
LoginPage l=new LoginPage(driver);
l.login(un, pw);
}
@AfterMethod
public void logout() {
HomePage h=new HomePage(driver);
h.logout();
}

}
