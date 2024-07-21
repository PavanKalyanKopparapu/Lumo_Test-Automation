package com.luma.initilize;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class DriverInit {
	
	public static WebDriver driver;
	
	
	public static WebDriver launchBrowser() {
		
		
		  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://magento.softwaretestingboard.com/");
		  driver.manage().window().maximize();
		
		return driver;
	}

}
