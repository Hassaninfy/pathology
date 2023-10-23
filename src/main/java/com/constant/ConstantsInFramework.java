package com.constant;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public final class ConstantsInFramework {

	
	private ConstantsInFramework() {
		
	}
	//in above we have created private constructor so no one can create object or inctance of this class
	
	private static final String CHROMEDRIVERPATH = System.getProperty("user.dir")+ "src\\test\\resources\\executables\\chromedriver.exe";

	public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
	}
	
	
	/*
	 * public static void highlightElement(WebDriver driver, String element) {
	 * JavascriptExecutor js = (JavascriptExecutor) driver; // Change the border
	 * style and color to highlight the element
	 * js.executeScript("arguments[0].style.border='3px solid red'", element); //
	 * Wait for a short duration to see the highlighting effect (you can adjust
	 * this) try { Thread.sleep(1000); } catch (InterruptedException e) {
	 * e.printStackTrace(); } // Revert the border style and color back to the
	 * original js.executeScript("arguments[0].style.border=''", element); }
	 */
	 
	 public static void highlightElement(WebDriver driver, String element) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        // Change background and border color to yellow to highlight the element
	        js.executeScript("arguments[0].('style', 'background: yellow; border: 2px solid red;');", element);

			/*
			 * try { // Introducing a small delay to see the highlight effect
			 * Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
			 * 
			 * // Reset the element's style back to its original state js.
			 * executeScript("arguments[0].setAttribute('style', 'border: solid 2px white');"
			 * , element); }
			 */
}}



//Make this class and veriable as final so that no one can inherite it