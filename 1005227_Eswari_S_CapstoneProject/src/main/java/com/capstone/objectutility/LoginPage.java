package com.capstone.objectutility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "user-name")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "login-button")
	private WebElement LoginBtn;
	
	
	
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginBtn() {
		return LoginBtn;
	}
		
	public WebElement getUsername() {
		return username;
	}

	

}
