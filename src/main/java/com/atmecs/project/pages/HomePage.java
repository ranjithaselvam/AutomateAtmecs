package com.atmecs.project.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.atmecs.project.constants.Constants;
import com.atmecs.project.helper.Helper;
import com.atmecs.project.utils.Utility;


public class HomePage {
	 public static WebDriver driver;
	
	public static void validateMoreInfo(String testData) throws IOException
	{
	    Helper.click(driver, testData);
		Helper.getText(driver,Utility.propertyRead(Constants.homePage_loc, "loc_breadcrumb_xpath_txt"));
		Helper.navigate(driver);		

		

	}

}
