package com.crm.pages;

import java.util.Set;

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
	
	@FindBy(xpath="//a[contains(text(),'Setup')]")
	WebElement setupButton;
	
	@FindBy(xpath="//a[contains(text(),'Help')]")
	WebElement helpButton;
	
	
	@FindBy(xpath="//a[contains(text(),'Calendar')]")
	WebElement calendar;
	
	@FindBy(xpath="//a[contains(text(),'Companies')]")
	WebElement companies;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contacts;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement deals;
	
	@FindBy(xpath="//td[contains(text(),'Global Account Administration')]")
	WebElement setupPageOpen;
	
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
	
	public SetupPage setupClick()
	{
		setupButton.click();
		return new SetupPage();
	}
	
	public Set<String> helpClick()
	{
		helpButton.click();
		return driver.getWindowHandles();
	}
	
	public boolean setupPageDisplayed()
	{
		return setupPageOpen.isDisplayed();
	}
	
}
