package com.capstone.objectutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	WebDriver driver;
	
	public AddToCart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath = "//*[name()='svg']")
	private WebElement AddToCartBtn;

	@FindBy(xpath = "//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")
	
	private WebElement CheckOut;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAddToCartBtn() {
		return AddToCartBtn;
	}

	public WebElement getCheckOut() {
		return CheckOut;
	}
	
		
}
