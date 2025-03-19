package com.capstone.objectutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
}

	@FindBy(xpath = "(//button[@class='btn_primary btn_inventory'])[1]")
	private WebElement prod1;

	@FindBy(xpath = "(//button[@class='btn_primary btn_inventory'])[2]")
	private WebElement prod2;
	
	@FindBy(xpath = "(//button[@class='btn_primary btn_inventory'])[3]")
	private WebElement prod3;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getProd1() {
		return prod1;
	}

	public WebElement getProd2() {
		return prod2;
	}

	public WebElement getProd3() {
		return prod3;
	}
	
}