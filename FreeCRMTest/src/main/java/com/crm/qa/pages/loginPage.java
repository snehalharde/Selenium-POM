package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.testBase;

public class loginPage extends testBase {

	
	@FindBy(name ="username")
	WebElement username;
	
	@FindBy(name ="password")
	WebElement password;
	
	@FindBy(name ="username")
	WebElement username;
	
	public loginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

}
