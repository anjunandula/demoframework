package com.movemoney.zelle.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseTest {

	public static WebDriver driver;

	public void openBrowser(String browsername) {

		// driver = new ChromeDriver();
		if (browsername.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Lib//chromedriver.exe");
			
			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Lib//geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browsername.equalsIgnoreCase("IE")) {
			
			driver = new InternetExplorerDriver();

		} else if (browsername.equalsIgnoreCase("Safari")) {
			
			driver = new SafariDriver();
		} else {
			
			driver = new ChromeDriver();

		}
		
		driver.get("https://secure.bankofamerica.com/");
		
		driver.manage().window().maximize();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
