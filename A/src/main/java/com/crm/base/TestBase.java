package com.crm.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.testData.TestUtil;

public class TestBase 
{
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() 
	{
		prop= new Properties();
		FileInputStream ip;
		try {
			ip = new FileInputStream("/Users/mohitrajupardeshi/eclipse-workspace/A/src/main/java/com/crm/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


public static void initialization() {
	String browserName= prop.getProperty("browser");
	if (browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","/Users/mohitrajupardeshi/Desktop/Mohit/Selenium/chromedriver");
		driver=new ChromeDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
}

}