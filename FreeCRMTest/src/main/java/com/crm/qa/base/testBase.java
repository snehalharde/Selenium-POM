package com.crm.qa.base;
//something
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.testutil.testUtil;

public class testBase {
	
	public static WebDriver driver;//driver will be accessed by other classes
	
	public static Properties prop;//prop will be accessed by other classes
	
	public testBase() throws IOException {
		try {
				 prop = new Properties();
				 FileInputStream ip = new FileInputStream("C:\\Users\\snehal\\Documents\\Java-Eclipse-Workspace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
				 prop.load(ip);
				
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}
		}
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\snehal\\Documents\\Selenium\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if(browserName.equals("FF")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\snehal\\Documents\\Selenium\\Drivers\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(testUtil.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(testUtil.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
	
	}
		
	}



