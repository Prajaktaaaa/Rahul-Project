package test;

import java.io.IOException;

import org.openqa.selenium.bidi.log.Log;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.Login;

public class LoginPageTest extends TestBase {
	Login log ;
	
	
	
	@BeforeTest
	public void setUp() throws IOException 
	{
		
		initialization();
		log = new Login();
	}
	@Test
	public void  verifyTitleTest()
	{
		String Title =log.verifyTitle();
		Assert.assertEquals("Kite - Zerodha's fast and elegant flagship trading platform", Title);
	}
	
	
	@Test
	public void verifyZerodhaLogoTest() 
	{
		log.verifyZerodhaLogo();
	}
	
	@Test
	public void  verifyKiteLogoTest() 
	{
		log.verifyKiteLogo();
	}
	@Test
	public void  LoginAccountTest() throws InterruptedException 
	{
		log.LoginAccount();
	}
	
	
	

}
