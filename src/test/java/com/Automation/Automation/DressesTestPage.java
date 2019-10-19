package com.Automation.Automation;

import org.testng.annotations.Test;

public class DressesTestPage {
	DressesObjectPage DO;
	
	public DressesTestPage(){
		DO = new DressesObjectPage();
	}
	
	@Test(priority=0)
	public void VerifySelectDresses(){
		DO.SelectDresses().click();
	}
	
	@Test(priority=1)
	public void VerifyOrangeDress(){
		DO.SelectOrange().click();
	}
	
	@Test(priority=2)
	public void VerifyAddToCart(){
		DO.ClickAddToCart().click();
	}
	
	@Test(priority=3)
	public void VerifyCartLayer(){
		DO.SelecttionOfLayer().click();
	}
	
	@Test(priority=4)
	public void verifyCheckout(){
		DO.SelectCheckOut().click();
	}
	
	@Test(priority=5)
	public void VerifyCart(){
		DO.SelectPageCart().click();
	}

}
