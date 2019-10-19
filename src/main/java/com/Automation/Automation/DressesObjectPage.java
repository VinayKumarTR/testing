package com.Automation.Automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressesObjectPage extends BasePage {
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement Dresses;
	
	@FindBy(xpath="//*[@id='center_column']/ul/li[1]/div")
	private WebElement OrangeBottom;
	
	@FindBy(xpath="//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]/span")
	private WebElement AddToCart;
	
	@FindBy(xpath="//*[@id='layer_cart']/div[1]")
	private WebElement SelectionOfCartLayer;
	
	@FindBy(xpath="//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
	private WebElement CheckOut;
	
	@FindBy(xpath="//*[@id='header']/div[3]/div/div/div[3]/div/a")
	private WebElement PageCart; 
	
	public DressesObjectPage(){
		PageFactory.initElements(driver, this);
	}
	
	public WebElement SelectDresses(){
		return Dresses;
	}
	
	public WebElement SelectOrange(){
		return OrangeBottom;
	}
	
	public WebElement ClickAddToCart(){
		return AddToCart;
	}
	
	public WebElement SelecttionOfLayer(){
		return SelectionOfCartLayer;
	}
	
	public WebElement SelectCheckOut(){
		return CheckOut;
	}
	
	public WebElement SelectPageCart(){
		return PageCart;
	}

}
