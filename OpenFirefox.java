package com.neotech.selenium01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.redfin.com/");
		
		String expectedURL = "https://www.redfin.com/";
		
		String actualURL = driver.getCurrentUrl();
		
		if(expectedURL.equals(actualURL)){
			
			System.out.println("Welcome. Title: " + driver.getTitle());
			
		}else {
			
			System.out.println("Wrong Page.");
		}
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}
