package com.atmecs.project.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




	/**
	 * Move around screen in horizontal or vertical direction.
	 * To move the window up and down.
	 * Scroll by visible element
	 * @author ranjitha.selvam
	 *
	 */
	public class Scrolling  {
		
	
		public static void scrollUp(WebDriver driver) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(300,0)", "");

		}

		public static void scrollDown(WebDriver driver) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)", "");
		}
		
		public static void byVisibleElement(WebDriver driver,String xpath) {
	        

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	               		
            WebElement element = driver.findElement(By.xpath(xpath));
	        js.executeScript("arguments[0].scrollIntoView(true);", element);
	        //element.click();
	        		
	       
	        
	        

	}
	

	}

