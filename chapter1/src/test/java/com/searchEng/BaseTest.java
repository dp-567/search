package com.searchEng;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	 WebDriver driver = null;
	
	
	@Parameters("browserName")
	@BeforeClass
	 public void setDriver(String browserName) {
		if(browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options= new ChromeOptions();
			options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
			options.setExperimentalOption("useAutomationExtension", false);
			driver= new ChromeDriver(options);
			}
		else if(browserName.equalsIgnoreCase("Firefox")) {
				WebDriverManager.firefoxdriver().setup();	
				driver= new FirefoxDriver();
		}
		
	}
	
	public  WebDriver getDriver() {
		return driver;
	}
	
	public void maximizeBrowser() {
        try{
           
            driver.manage().window().maximize();
        }
        catch (Exception ex){
            
            driver.manage().window().toString();
        }
	}
	
	
	@AfterClass
	public void teardown() {
		if(driver!=null)
			driver.close();
		
	}
}
