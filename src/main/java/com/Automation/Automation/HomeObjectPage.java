package com.Automation.Automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeObjectPage extends BasePage {
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/a")
	private WebElement Women;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement Dresses;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[3]/a")
	private WebElement TShirts;
	
	@FindBy(xpath="//*[@id='newsletter-input']")
	private WebElement NewsLetter;
	
	@FindBy(xpath="//*[@id='newsletter_block_left']/div/form/div/button")
	private  WebElement Button;
	
	@FindBy(xpath="//*[@id='columns']/p")
	private WebElement Subscription;
	
	public HomeObjectPage(){
		PageFactory.initElements(driver, this);
	}
	
	public WebElement DisplayWomen(){
		return Women;
	}
	
	public WebElement DisplayDresses(){
		return Dresses;
	}
	
	public WebElement DisplayTShirts(){
		return TShirts;
	}
	
	public WebElement SelectNewsLetter(){
		return NewsLetter;
	}
	
	public  WebElement SelectButton(){
		return Button;
	}
	
	public  WebElement SubscriptionMessage(){
		return Subscription;
	}

}
