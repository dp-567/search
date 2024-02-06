package com.searchEng.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends Page{

	public SearchPage(WebDriver driver) {
		super(driver);
		
	}
	
	 public final By searchBtn = new By.ByName("q");
	

}
