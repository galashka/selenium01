package com.neotech.selenium01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class OpenChrome {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		String title =  driver.getTitle();
		
		System.out.println("Title: " + title);
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}
