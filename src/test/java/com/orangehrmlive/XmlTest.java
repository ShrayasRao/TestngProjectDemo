package com.orangehrmlive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class XmlTest {
	
	@Parameters({"uname","pass"})
	@Test
	public void paraTest(String uname, String pass) {
		System.setProperty("webdriver.chrome.driver",
				"G:\\Workspace\\Eclipse\\ASDM\\testseleniummaven\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Enter URL");
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.findElement(By.name(uname)).sendKeys("Admin");

		driver.findElement(By.id(pass)).sendKeys("admin123");

		driver.findElement(By.name("Submit")).click();

	}
}
