package com.bit.configBrowser;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserOpen 
{
	public FirefoxDriver driver;
	@Before
	public void StartBrowser() 
	{
		System.setProperty("webdriver.gecko.driver", "/Users/jarrellsimon/Downloads/geckodriver");
		driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("http://www.teachwise.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().refresh();
	}
	
	@After
	public void closeBrowser() throws InterruptedException 
	{
		Thread.sleep(3000);
		//driver.quit();
		
	}

}
