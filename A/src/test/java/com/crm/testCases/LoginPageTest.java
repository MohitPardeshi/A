package com.crm.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.base.TestBase;
import com.crm.pages.LoginPage;


public class LoginPageTest extends TestBase
{

	LoginPage loginPage;

public LoginPageTest() {
		super();
		
	}


@BeforeMethod
public void setUp()
{
	initialization();
	loginPage=new LoginPage();
}

@Test(priority = 1)
public void loginPageTitleTest()
{
String title=loginPage.validateLoginPageTitle();
Assert.assertEquals(title,"CRMPRO - CRM software for customer relationship management, sales, and support.");
}

@Test(priority = 2)
public void loginIncorrectDetailsTest()
{
	loginPage.login(prop.getProperty("userName1"),prop.getProperty("password"));
}


@Test(priority = 3)
public void successfulLoginTest()
{
	loginPage.login(prop.getProperty("userName"),prop.getProperty("password"));
}

@AfterMethod
public void tearDown()
{
driver.close();	
}
}
