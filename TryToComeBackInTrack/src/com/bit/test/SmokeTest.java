package com.bit.test;

import org.junit.Test;
import org.openqa.selenium.By;

import com.bit.configBrowser.BrowserOpen;
import com.bit.support.Core;

public class SmokeTest extends BrowserOpen 
{
	@Test
	public void test1() throws InterruptedException 
	{
		Core core = new Core(driver);
		core.verifyTitle("asad");
		core.clickOnElement(By.xpath("//*[@id='nav']/li[2]/a"));
		core.pillerCatProduct();
		core.findMath("Math Numbers");
		core.addingItem();
		core.clickOnAddChart();
		core.clickOnRag();
		core.clickOnCartSummary();
		core.clickOnLessButtom();
		core.clickUpdateCart();
		core.verifyCardItem("avoid one");
		core.proceedToCheckOut();
		
		
		
	}

}
