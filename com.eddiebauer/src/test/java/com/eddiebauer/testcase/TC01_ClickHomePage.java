package com.eddiebauer.testcase;

import org.testng.annotations.Test;

public class TC01_ClickHomePage extends BaseTest{
	
	@Test
	public void testClickViewAllOffers(){
		homePage.clickViewAllOffersLink();
		homePage.clickDetailsButton1();
		homePage.clickCloseDetailsButton1();
		homePage.clickDetailsButton2();
		homePage.clickCloseDetailsButton2();
		homePage.clickDetailsButton3();
		homePage.clickCloseDetailsButton3();
		homePage.clickRightArrowButton();
	}
}
