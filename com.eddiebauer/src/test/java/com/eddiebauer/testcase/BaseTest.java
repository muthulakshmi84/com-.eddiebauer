package com.eddiebauer.testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.eddiebauer.base.DriverScript;
import com.eddiebauer.pages.HomePage;

public class BaseTest extends DriverScript{
	
	HomePage homePage;
	ExtentReports extent;
	ExtentTest logger;
	
	@BeforeClass
	public void preTest(){
		ExtentHtmlReporter htmlReport=new ExtentHtmlReporter("./report/AutomationReport.html");
		extent=new ExtentReports();
		extent.attachReporter(htmlReport);
	}
	
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
	
	@AfterClass
	public void tearDown(){
		extent.flush();
	}
}
