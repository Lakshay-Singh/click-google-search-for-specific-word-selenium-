package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTests { 
	@Test
	public void searchbarTest() {
		//create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//open test page
		String url="https://www.google.com/";
		driver.get(url);
		
		//search bar
		WebElement sbar=driver.findElement(By.name("q"));
		sbar.sendKeys("qualitest");
		sbar.submit();
		
		driver.quit();
		
	}
}
