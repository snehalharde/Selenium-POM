package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.testBase;

public class loginPage extends testBase {

	//pagefactory or OR
	//all the login related objects are defined in login page
	
	@FindBy(name ="username")
	WebElement username;
	
	@FindBy(name ="password")
	WebElement password;
	
	@FindBy(xpath ="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//button[contains(text(), 'Sign Up')]")
	WebElement signupBtn;
	
	public loginPage() throws IOException {
		PageFactory.initElements(driver, this);//this pointing to current class obj
		
		// TODO Auto-generated constructor stub
	}

	public String validateLoginTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String un, String pwd) {//from login page we return homepage
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}
	
}
