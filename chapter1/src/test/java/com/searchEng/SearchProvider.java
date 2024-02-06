package com.searchEng;
import org.testng.annotations.DataProvider;

public class SearchProvider {

	     @DataProvider(name = "search")
		 public static Object[][] searchData() {
		   return new Object[][] {
				{
				   "http://www.google.com"
				   },
			   {
			   "http://www.bing.com"
			   }
			   
	         
		   } ;
			  
		 }
			

	


}
