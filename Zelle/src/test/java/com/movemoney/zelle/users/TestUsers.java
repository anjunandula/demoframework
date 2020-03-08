package com.movemoney.zelle.users;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.movemoney.zelle.utils.BaseTest;

public class TestUsers extends BaseTest
{
	@BeforeMethod
	public void beforemethod () {
	
		openBrowser("Firefox");
		
	}
	
	@AfterMethod
public void aftermethod() {
		
		driver.quit();
	}
	
	
	
	@Test (priority=3, dependsOnMethods="SB")
	public void Consumer() {
		
		System.out.println("Consumer");
		
	}

	@Test (priority=1)
	public void SB() {
		
		System.out.println("SB");
		Assert.assertEquals("User created.", "User Created Sucessfully.");
		
		
	}

	@Test (priority=2)
	public void Hyrbid() {
		
		System.out.println("Hybrid");
	}
	
	
	
	
	
	
	
}

