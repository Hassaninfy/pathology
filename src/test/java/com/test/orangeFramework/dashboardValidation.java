package com.test.orangeFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class dashboardValidation {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@kennect.io");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Qwerty@1234");
	  driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();
	  Thread.sleep(6000);
	  driver.findElement(By.xpath("//div[@class='jss73']")).isDisplayed();
	    System.out.println("Execution completed");
	    
	    Actions actions = new Actions(driver);
	    //WebElement todo = driver.findElement(By.xpath("//div[@class='jss73']"));
	//   WebElement todo = driver.findElement(By.xpath("//span[contains(text(),'Accounting')]"));
        // Scroll to the element using moveToElement
        actions.moveByOffset(0,500);
        actions.perform();
        Thread.sleep(4000);
	    
        WebElement d = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiAutocomplete-popupIndicator']"));
        actions.click(d);
        actions.perform();
	    System.out.println("Execution completed 2");
	  //  WebElement list = driver.findElement(By.xpath("//input[@id='patient-test']"));
	//    Select s= new Select(list);
	   // s.selectByIndex(1);
	    
	    Thread.sleep(6000);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\hassa\\Desktop\\driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://gor-pathology.web.app/");
	  driver.manage().window().maximize();
	  
	 
	  
	  
	  }

  @AfterTest
  public void afterTest() {
	driver.quit();
  }

}
