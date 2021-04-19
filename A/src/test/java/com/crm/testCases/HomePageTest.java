package com.crm.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.base.TestBase;
import com.crm.pages.LoginPage;
import com.crm.testData.TestUtil;
import com.crm.pages.*;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage=new LoginPage();
		testUtil=new TestUtil();
		homePage=loginPage.login(prop.getProperty("userName"),prop.getProperty("password"));
	}
	
	
	@Test(priority = 1) 
	public void validateHomeTitleTest()
	{ 
		String title=homePage.getHomePageTitle();
		Assert.assertEquals(title, "CRMPRO");
	}
	 
	
	@Test(priority = 2)
	public void userNameLabelDisplayedTest()
	{
		testUtil.switchWindowFrame("mainpanel");
		Assert.assertTrue(homePage.getUserNameLabel());
	}
	
	@Test(priority = 3)
	public void logoutTest()
	{
		testUtil.switchWindowFrame("mainpanel");
		loginPage=homePage.logoutClick();
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.",driver.getTitle(),"This case failed due to title is not same");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		//driver.close();
	}
	

}
