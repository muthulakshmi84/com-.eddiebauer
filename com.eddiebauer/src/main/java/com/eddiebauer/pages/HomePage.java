package com.eddiebauer.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eddiebauer.base.DriverScript;
import com.eddiebauer.utils.Generic;

public class HomePage extends DriverScript{

	@FindBy(xpath="//span[normalize-space()='VIEW ALL OFFERS']") WebElement viewAllOffersLink;
	@FindBy(xpath="(//a[contains(@class,'details') and @role='button' ])[1]") WebElement detailsButton1;
	@FindBy(xpath="//div[@aria-label='Close']//*[local-name()='svg']") WebElement closeDetailsButton1;
	@FindBy(xpath="(//a[contains(@class,'details') and @role='button' ])[2]") WebElement detailsButton2;
	@FindBy(xpath="//div[@aria-label='Close']//*[local-name()='svg']//*[name()='path' and contains(@d,'M17.41,16l')]") WebElement closeDetailsButton2;
	@FindBy(xpath="(//a[contains(@class,'details') and @role='button' ])[3]") WebElement detailsButton3;
	@FindBy(xpath="//div[@aria-label='Close']//*[local-name()='svg']") WebElement closeDetailsButton3;
	@FindBy(xpath="//div[@class='content']//span[@class='arrows right_arrow']") WebElement rightArrowButton;
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public void clickViewAllOffersLink(){
		viewAllOffersLink.click();
		Generic.fn_sleep();
		System.out.println("View all offers link clicked");
	}
	
	public void clickDetailsButton1(){
		detailsButton1.click();
		Generic.fn_sleep();
	}
	
	public void clickCloseDetailsButton1(){
		closeDetailsButton1.click();
		Generic.fn_sleep();
	}
	
	public void clickDetailsButton2(){
		detailsButton2.click();
		Generic.fn_sleep();
	}
	
	public void clickCloseDetailsButton2(){
		closeDetailsButton2.click();
		Generic.fn_sleep();
	}
	
	public void clickDetailsButton3(){
		detailsButton3.click();
		Generic.fn_sleep();
	}
	
	public void clickCloseDetailsButton3(){
		closeDetailsButton3.click();
		Generic.fn_sleep();
	}
	
	public void clickRightArrowButton(){
		actions.moveToElement(rightArrowButton).click().perform();
		System.out.println("Moved to right arrow");
		Generic.fn_sleep();
		rightArrowButton.click();
		//actions.click(rightArrowButton).build().perform();
		System.out.println("clicked on right arrow");
		Generic.fn_sleep();
	}
}
