package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Login extends TestBase {
	@FindBy(xpath="//img[@alt='Kite']")private WebElement kiteLogo; 
	@FindBy(xpath="//img[@alt='Zerodha']") private WebElement zerodhaLogo;	
	@FindBy(xpath="//input[@label='User ID']")private WebElement useridTextBox;
	@FindBy(xpath="//input[@type='password']")private WebElement passwordTextBox;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginBtn; 
	@FindBy(xpath="//Input[@Id=\'pin\']")private WebElement pin;
	@FindBy(xpath="//button[@class='button-orange wide']")WebElement continuebtn;
	
	
	@FindBy(xpath="//button[@class=\'button-orange wide\']")private WebElement ContinueBtn;
	

	public Login() {
		PageFactory.initElements(driver,this);
	}
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyZerodhaLogo()
	{
		return zerodhaLogo.isDisplayed();
		
	}
	
	public boolean verifyKiteLogo()
	{
		return  kiteLogo.isDisplayed();
		
	}
	public void LoginAccount() throws InterruptedException
	{
		useridTextBox.sendKeys("RCZ545 ");
		Thread.sleep(2000);
		passwordTextBox.sendKeys("Smeet@666");
		Thread.sleep(2000);
		loginBtn.click();
		Thread.sleep(2000);
		pin.sendKeys("112233");
		continuebtn.click();
		 
		 
	}
	
	
}
