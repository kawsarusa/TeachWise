package com.bit.support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Core 
{
	FirefoxDriver driver;
	public Core(FirefoxDriver driver) 
	{
		this.driver = driver;
	}
	
	public void verifyTitle(String text) 
	{
		boolean result = driver.getTitle().contains(text);
		if (result) 
		{
			System.out.println("title contains "+text);
		}
		else 
		{
			System.out.println("title does not contains "+text);
		}
		
	 }
	 public WebElement waitForElement(WebElement element)
	 {
		 ExpectedConditions.visibilityOf(element);
		 return element;
	 }
	 
	 public void clickOnElement(By by) 
	 {
		 waitForElement(driver.findElement(by)).click();
	 }
	 public void pillerCatProduct() throws InterruptedException 
	 {
		 driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div/div[2]/ul/li[3]/div[1]/h2/a")).click();
		 Thread.sleep(4000);
	 }
	 public void findMath(String text) 
	 {
		  boolean result = driver.getTitle().contains(text);
		 if(result) 
		 {
			System.out.println("title Contains" +text);
		 }
		 else 
		 {
			 System.out.println("title does not contains " +text);
		 }
	 }
	 public void addingItem() throws InterruptedException 
	 {
		 driver.findElement(By.xpath(".//*[@id='product_addtocart_form']/div[2]/div[2]/div[2]/div[2]/div/div[1]/span[2]")).click();
		 Thread.sleep(4000);
	 }
	 public void clickOnAddChart() throws InterruptedException 
	 {
		 driver.findElement(By.xpath(".//*[@id='product_addtocart_form']/div[2]/div[2]/div[2]/div[2]/div/div[1]/button")).click();
		 Thread.sleep(4000);
	 }
	 public void clickOnRag() throws InterruptedException 
	 {
		 driver.findElement(By.xpath(".//*[@id='cartHeader']")).click();
		 Thread.sleep(4000);
	 }
	 public void clickOnCartSummary() throws InterruptedException
	 {
		 System.out.println("okay");
		 driver.findElement(By.xpath("//*[@id=\"topCartContent\"]/div/div/a")).click();
		 Thread.sleep(3000);
		 System.out.println("okay");
	 }
	 public void clickOnLessButtom() throws InterruptedException 
	 {
		 driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[3]/span[1]")).click();
		 Thread.sleep(4000);
	 }
	 public void clickUpdateCart() 
	 {
		 driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tfoot/tr/td/button[2]")).click();
	 }
	 public void verifyCardItem(String text) 
	 {
		 boolean result = driver.getTitle().contains(text);
		 if(result) 
		 {
			 System.out.println("yes, your cart contains" +text);
		 }else 
		 {
			 System.out.println("no, your cart contains" +text);
		 }
	 }
	 public void proceedToCheckOut() 
	 {
		 driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[1]/div[2]/ul/li[1]/button/span/span")).click();
	 }

 }
