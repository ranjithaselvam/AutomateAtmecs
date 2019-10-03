package com.atmecs.project.script;




import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.atmecs.project.constants.Constants;
import com.atmecs.project.constants.PageGetText;
import com.atmecs.project.helper.MouseOver;
import com.atmecs.project.helper.Navigate;
import com.atmecs.project.helper.Scrolling;
import com.atmecs.project.helper.Wait;
import com.atmecs.project.report.LoggerReportInfo;
import com.atmecs.project.testbase.Browsers;
import com.atmecs.project.utils.ExcelReader;
import com.atmecs.project.utils.PropertyReader;
import com.atmecs.project.validation.WebSiteValidation;

public class ValidateHomePage extends Browsers {
	
	@Test(priority=1)
	public void clickOptionsExplore() throws Exception 
	{
		LoggerReportInfo.logReporter("login into atmecs");
		Wait.implicitWait(driver);
		MouseOver.click(driver, PropertyReader.read(Constants.homePage_loc,"loc_home_xpath_link"));
		LoggerReportInfo.logReporter("click option explore now in home page");
		MouseOver.click(driver, PropertyReader.read(Constants.homePage_loc, "loc_explore_xpath_clk"));
	}	
	
	@DataProvider
	  public Object[][] breadCrumb() throws Exception {
	  Object data[][] = ExcelReader.getExcel(Constants.breadCrump_testData, "Sheet1");
	  return data;
		}


    @Test(dataProvider = "breadCrumb",priority=2)

		
   
     public void clickOptionMoreInfo(String artificial,String argument,String iot,String robotics,String blockchain) throws IOException {
    	  Navigate.click(driver);
    	
    	  String currentPage = PageGetText.text(PropertyReader.read(Constants.homePage_loc, "loc_homepage_xpath_txt"),"Home Page");
    	  MouseOver.click(driver, PropertyReader.read(Constants.homePage_loc,"loc_moreinfo1_xpath_clk"));
          String artificialPage=PageGetText.text(PropertyReader.read(Constants.homePage_loc, "loc_aiinfo_xpath_txt"),"Artificial Intelligence page");
    	 
		
		  Navigate.click(driver);
		  Scrolling.scrollDown(driver);
		  MouseOver.click(driver,PropertyReader.read(Constants.homePage_loc,"loc_moreinfo2_xpath_clk"));
		  String argumentPage=PageGetText.text(PropertyReader.read(Constants.homePage_loc, "loc_arinfo_xpath_txt"),"Augumented reality page");
		  
		  
		  Navigate.click(driver);
		  Scrolling.scrollDown(driver);
		  MouseOver.click(driver, PropertyReader.read(Constants.homePage_loc,"loc_moreinfo3_xpath_clk"));
		  String iotPage=PageGetText.text(PropertyReader.read(Constants.homePage_loc, "loc_iotinfo_xpath_txt"),"IOT page");
		  
		 
		  Navigate.click(driver); 
		  Scrolling.scrollDown(driver);
		  MouseOver.click(driver, PropertyReader.read(Constants.homePage_loc,"loc_moreinfo4_xpath_clk"));
		  String roboticPage=PageGetText.text(PropertyReader.read(Constants.homePage_loc, "loc_roboticinfo_xpath_txt"),"Robotic page"); 
		  
		 
		  Navigate.click(driver);
		  Scrolling.scrollDown(driver);
		  MouseOver.click(driver, PropertyReader.read(Constants.homePage_loc,"loc_moreinfo5_xpath_clk"));
		  String blockChainPage=PageGetText.text(PropertyReader.read(Constants.homePage_loc, "loc_bcinfo_xpath_txt"),"Block chain page");
		  
			 
		  Navigate.click(driver);
		  if(!currentPage.equals(artificialPage)&&!currentPage.equals(argumentPage)&&!currentPage.equals(iotPage)&&!currentPage.equals(roboticPage)&&!currentPage.equals(blockChainPage))
	    	 {
	    		 LoggerReportInfo.logReporter("user landed successfully");
	    	 }
		  else
		  {
			  LoggerReportInfo.logReporter("user in same page");
		  }
		 
		/*
		 * WebSiteValidation.pageValidation(artificialPage, artificial);
		 * WebSiteValidation.pageValidation(argumentPage, argument);
		 * WebSiteValidation.pageValidation(iotPage, iot);
		 * WebSiteValidation.pageValidation(roboticPage, robotics);
		 * WebSiteValidation.pageValidation(blockChainPage, blockchain);
		 */
    	
    	
	
		
		
	
		
		
	}
	
	

}
