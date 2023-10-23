package com.test.orangeFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.constant.ConstantsInFramework;
//simport com.constant.BaseTest;
import com.constant.DataDriven;
import com.pageObject.DashboardPageObject;
import com.pageObject.LoginPageObject;

public class Login extends BaseTest {
	DashboardPageObject db = new DashboardPageObject ();
	LoginPageObject obj = new LoginPageObject();
	DataDriven obg1 = new DataDriven();
//	WebDriver driver;
	//Before it was here but now we have created base test class
	@Test
	public void login() throws InterruptedException, IOException  {
//		obg1.fetchData();
		driver.findElement(By.xpath(obj.loginText)).sendKeys("test@kennect.io");
		//ConstantsInFramework.highlightElement(driver, obj.loginText);
		driver.findElement(By.xpath(obj.passworText)).sendKeys("Qwerty@1234");
		Thread.sleep(2000);
		//ConstantsInFramework.highlightElement(driver, obj.loginText);
		//WebElement element = driver.findElement(By.xpath(obj.loginButton));
	   // ((JavascriptExecutor)driver).executeScript ("arguments[0].('style', 'background: yellow; border: 2px solid red;');", element);
		Thread.sleep(2000);
	    driver.findElement(By.xpath(obj.loginButton)).click();
	   // WebDriverWait wait = new WebDriverWait(driver, 10);
      //  WebElement elementToHighlight = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("your_xpath_here")));
	
	    Thread.sleep(6000);
	    driver.findElement(By.xpath(db.toDo)).isDisplayed();
	    System.out.println("Execution completed");
	    
	    Actions actions = new Actions(driver);

        // Scroll to the element using moveToElement
 //       actions.moveToElement(db.toDo);
        actions.perform();

	    
	  //  driver.findElement(By.xpath(db.addTestButton)).click();
	    
	 //   Select s = new Select (db.dropdown(d));
	 //   s.deselectByIndex(1);
	    Thread.sleep(2000);
	}
	
	
}

