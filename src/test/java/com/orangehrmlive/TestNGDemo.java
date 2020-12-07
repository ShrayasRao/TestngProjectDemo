package com.orangehrmlive;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.openqa.selenium.By.ByName;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Admin
 *
 */
public class TestNGDemo {
	
	WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		System.out.println("Opening Browser");
		System.setProperty("webdriver.chrome.driver", "G:\\Workspace\\Eclipse\\ASDM\\testseleniummaven\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Enter URL");
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	

	
	@BeforeMethod
	public void login() {
		System.out.println("Loging in");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.name("Submit")).click();
	}
	
	
	@Test
	public void adminTest() 
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Admin")).click();
	}
	@Test
	public void leaveTest() 
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Leave")).click();
	}
	@Test
	public void timeTest() 
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Time")).click();
	}
	
	
	@AfterMethod
	public void logout() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
		
	}
	
	
	
	
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("closed");
		driver.close();
		driver.quit();
	}
	
	

}

