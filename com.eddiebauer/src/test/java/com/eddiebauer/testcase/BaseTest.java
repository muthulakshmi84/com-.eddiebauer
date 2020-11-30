package com.eddiebauer.testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.eddiebauer.base.DriverScript;
import com.eddiebauer.pages.HomePage;

public class BaseTest extends DriverScript{
	
	HomePage homePage;
	
	@BeforeTest
	public void preCondition(){
		initBrowser();
		System.out.println("executed initBrowser()");
		launchApplication();
		System.out.println("launchApplication();");
		homePage=new HomePage();
	}
	
	@AfterTest
	public void postCondition(){
		//closeApplication();
	}
	
}
