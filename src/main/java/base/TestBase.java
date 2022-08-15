package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public String readPropertyFile(String value) throws IOException {
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\admin29\\Desktop\\dummy\\NewMaven\\config.properties");
		prop.load(file);
		return prop.getProperty(value);
		}
	public  void initialization() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.get("https://kite.zerodha.com/");
		driver.get(readPropertyFile("url"));
		
		
	}
}