package com.eddiebauer.testcase;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class TC01_ClickHomePage extends BaseTest{
	
	@Test
	public void testClickViewAllOffers(){
		logger=extent.createTest("Validate clicking view all offers link");
		homePage.clickViewAllOffersLink();
		logger.log(Status.PASS, "Clicked on View All Offers Link");
		homePage.clickDetailsButton1();
		logger.log(Status.PASS, "Clicked on Details Button1");
		homePage.clickCloseDetailsButton1();
		logger.log(Status.PASS, "Clicked on Close Details Button1");
		homePage.clickDetailsButton2();
		logger.log(Status.PASS, "Clicked on Details Button2");
		homePage.clickCloseDetailsButton2();
		logger.log(Status.PASS, "Clicked on Close Details Button2");
		homePage.clickDetailsButton3();
		logger.log(Status.PASS, "Clicked on Details Button3");
		homePage.clickCloseDetailsButton3();
		logger.log(Status.PASS, "Clicked on Close Details Button3");
		homePage.clickRightArrowButton();
	}
}
