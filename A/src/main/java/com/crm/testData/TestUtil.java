package com.crm.testData;

import java.sql.Driver;

import com.crm.base.TestBase;

public class TestUtil extends TestBase
{

	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT= 10;

	public void switchWindowFrame(String frameName)
	{
		driver.switchTo().frame(frameName);
	}
}
