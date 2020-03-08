package com.movemoney.zelle.utils.seleniumutils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumUtils {
	
	public static WebDriver driver;

	
	
	public static void launchBrowser(String browserName) {

		System.out.println("Browser is launching : "+browserName);
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Lib/chromedriver.exe");
		
		driver = new ChromeDriver();
		
	}

}
