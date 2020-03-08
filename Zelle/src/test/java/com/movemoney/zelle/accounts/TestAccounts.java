package com.movemoney.zelle.accounts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.movemoney.zelle.utils.BaseTest;

public class TestAccounts extends BaseTest{

	@BeforeMethod
	public void beforeMethod() {
		openBrowser("Chrome");
	}
	
	@AfterMethod
	public void exitBrwoser() {
		driver.quit();
	}
	
	
	@Test(priority=1 )
	public void createAccountTest() {
			
		System.out.println("creating account in Bank");
		
	}
	
	
	@Test(priority=2)
	public void updateAccountTest() {
		
		System.out.println("updating user account details");
		
	}
	
	@Test(priority=3)
	public void deleteAccountTest() {
		
		System.out.println("deleting account");
	}
	
	
	
	
	
}
