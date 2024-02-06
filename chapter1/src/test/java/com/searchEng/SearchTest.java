package com.searchEng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.searchEng.Pages.SearchPage;


public class SearchTest extends BaseTest {
	
SearchPage sp =new SearchPage(driver);
  
    @Test
    (dataProvider= "search",dataProviderClass = SearchProvider.class)
    public void runSearchTest(String url) {
    	driver.get(url);
  	    WebElement searchBtn=driver.findElement(sp.searchBtn);
  	    searchBtn.sendKeys("Selenium Java");
  	    searchBtn.submit(); 
  	    
    }
}
