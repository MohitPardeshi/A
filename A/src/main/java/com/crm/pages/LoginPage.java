package com.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.TestBase;

public class LoginPage extends TestBase {

	// Page Factory
	// Buttons

	@FindBy(xpath = "//li[@class='active']/a[1]")
	WebElement home;

	@FindBy(xpath = "//ul[@class='nav navbar-nav navbar-right']/li[2]/a")
	WebElement signUp;

	@FindBy(xpath = "//ul[@class='nav navbar-nav navbar-right']/li[3]/a")
	WebElement pricing;

	@FindBy(xpath = "//a[text()='Features']")
	WebElement features;

	@FindBy(xpath = "//a[text()='Customers']")
	WebElement customers;

	@FindBy(xpath = "//a[text()='Contact'")
	WebElement contact;

	@FindBy(name = "username")
	WebElement userName;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginBtn;

	// Initializing the web elements
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions

	public LoginPage clickHome() {
		home.click();
		return new LoginPage();
	}
	
	public SignUpPage clickSignUp()
	{
		signUp.click();
		return new SignUpPage();
	}
	
	public PricingPage clickPricing()
	{
		pricing.click();
		return new PricingPage();
	}

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public HomePage login(String us, String pwd) {
		userName.sendKeys(us);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}
}
