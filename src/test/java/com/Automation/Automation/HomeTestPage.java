package com.Automation.Automation;

import org.testng.annotations.Test;

public class HomeTestPage {
	HomeObjectPage HO;
	
	public HomeTestPage(){
		HO = new HomeObjectPage();
	}
	
	@Test(priority=0)
	public void VerifyWomen(){
		HO.DisplayWomen().isDisplayed();
	}
	
	@Test(priority=1)
	public void VerifyDresses(){
		HO.DisplayDresses().isDisplayed();
	}
	
	@Test(priority=2)
	public void VerifyTShirts(){
		HO.DisplayTShirts().isDisplayed();
	}
	
	@Test(priority=3)
	public void VerifyNewsLetter(){
		HO.SelectNewsLetter().sendKeys("abcd@xyz.com");
	}
	
	@Test(priority=4)
	public void VerifyButton(){
		HO.SelectButton().click();
	}
	
	@Test(priority=5)
	public void VerifySubscripton(){
		HO.SubscriptionMessage().isDisplayed();
	}

}
