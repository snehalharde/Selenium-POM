package com.crm.qa.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.testBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.loginPage;

public class LoginPageTest extends testBase{
	
	loginPage loginPage;

	HomePage homePage;
	
	public LoginPageTest() throws IOException {
		super();//super will call super class constructor testBase
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		loginPage = new loginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitle() {
		
		String title = loginPage.validateLoginTitle();
		Assert.assertEquals(title, "#1 Free CRM for Any Business");
		
	}
	
	
	@Test(priority=2)
	public void  loginTest() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
