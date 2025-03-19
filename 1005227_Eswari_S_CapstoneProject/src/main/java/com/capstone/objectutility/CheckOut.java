package com.capstone.objectutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut {
	WebDriver driver;
	
	public CheckOut(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id = "first-name")
	private WebElement firstName;

	@FindBy(id = "last-name")
	private WebElement lastName;
	
	@FindBy(id = "postal-code")
	private WebElement PostalCode;
	
	@FindBy(xpath = "//input[@value='CONTINUE']")
	private WebElement continueBtn;
	
	@FindBy(partialLinkText = "FINISH")
	private WebElement finishBtn;

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getFinishBtn() {
		return finishBtn;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getPostalCode() {
		return PostalCode;
	}
}

