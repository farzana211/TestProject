package com.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testBase.testBase;

public class tc001 extends testBase {
	public tc001 () {
		super();
	}
	
  @BeforeMethod
  public void initializationapp() throws Exception {
	  initialization();
  }
  com.pages.loginPage login = new  com.pages.loginPage();
  @Test
  public void loginKayak() throws Exception {
	login.clicklogin();  
  }
  @AfterMethod
  public void closeBrowser() {
	  login.tearDown();
  }
}
