package com.org.learningMaven;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class helloWorld {

	@Test
	public void someTest(){
		System.out.print("Opening Google");
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}
	
}
