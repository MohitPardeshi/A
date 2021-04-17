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
public void loginPageTitle()
{
String title=loginPage.validateLoginPageTitle();
Assert.assertEquals(title,"Swag Labs");
}

@Test(priority = 2)
public void LoginIncorrectDetails()
{
	loginPage.login(prop.getProperty("userName1"),prop.getProperty("password"));
}


@Test(priority = 3)
public void Login()
{
	loginPage.login(prop.getProperty("userName"),prop.getProperty("password"));
}

@AfterMethod
public void tearDown()
{
driver.close();	
}
}
