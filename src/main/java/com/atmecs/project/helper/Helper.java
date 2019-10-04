package com.atmecs.project.helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.project.constants.Constants;


/**
 * Handling mouse event(Clicks at the current mouse location). 
 * Navigate to back page.
 * To move the window up and down.( Scroll by visible element)
 * Wait for some time to load the element and execute at different interval time.        
 * Retrieving the specified elements Text(Get Text).
 * @author ranjitha.selvam 
 *
 * 
 */

 public class Helper {
	 
	 
	
	public static void move(WebDriver driver, String xpath) {
		WebElement findElement = driver.findElement(By.xpath(xpath));
		Actions action = new Actions(driver);
		action.moveToElement(findElement).perform();

	}
	

	
	public static void click(WebDriver driver, String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	

	
	public static void navigate(WebDriver driver) {
		driver.navigate().back();
	}

	
	public static void scroll(WebDriver driver, String xpath) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement element = driver.findElement(By.xpath(xpath));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	
	
		public static void explicitWait(WebDriver driver,String xpath)
		{
			WebDriverWait wait=new WebDriverWait(driver, Constants.page_load_timeout);
			WebElement element;
			element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			element.click();
			}
		
		
		public static void implicitWait(WebDriver driver)
		{
			driver.manage().timeouts().implicitlyWait(Constants.page_load_timeout, TimeUnit.SECONDS);
		}

		
			public static String getText(WebDriver driver,String properties)
			{
				String data = driver.findElement(By.xpath(properties)).getText();
				System.out.println(data);
				return data;
				
			}

		
		
		}




