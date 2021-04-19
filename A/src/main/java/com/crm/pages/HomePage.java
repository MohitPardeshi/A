package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.TestBase;

public class HomePage extends TestBase {
	
	
	
	@FindBy(xpath="//td[contains(text(),'User: group automation')]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//td[contains(text(),'User:automation')]")
	WebElement userNameLabel1;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement homeButton;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement logoutButton;
	
	//Initialize the page element
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public String getHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public Boolean getUserNameLabel()
	{
		return userNameLabel.isDisplayed();
	}
	
	public LoginPage logoutClick()
	{
		logoutButton.click();
		return new LoginPage();
	}
	
}
