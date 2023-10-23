
  package com.test.orangeFramework;
  
  import java.awt.Desktop; import java.io.File; import java.io.IOException;
  import java.net.MalformedURLException; import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType; import
  org.openqa.selenium.TakesScreenshot; import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; import
  org.openqa.selenium.chrome.ChromeOptions; import
  org.openqa.selenium.remote.DesiredCapabilities; import
  org.openqa.selenium.remote.RemoteWebDriver; import
  org.testng.annotations.AfterTest; import org.testng.annotations.BeforeTest;
  
  import com.aventstack.extentreports.ExtentReports; import
  com.aventstack.extentreports.ExtentTest; import
  com.aventstack.extentreports.MediaEntityBuilder; import
  com.aventstack.extentreports.reporter.ExtentSparkReporter; import
  com.constant.ConstantsInFramework;
  
  public class BaseTest { ExtentReports extent; WebDriver driver;
  
  @BeforeTest public void setUp() throws Exception {
  
  //ChromeOptions ops = new ChromeOptions(); //WebDriver driver = new
  //RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),ops); //above two
  //line for docker
  
  driver = new ChromeDriver(); ExtentSparkReporter spark = new
  ExtentSparkReporter("reportWithScreenshots/index.html"); extent = new
  ExtentReports(); spark.loadXMLConfig(new File("extentconfig.xml"));
  extent.attachReporter(spark); ExtentTest test=extent.createTest("LoginTest");
  
  System.setProperty("webdriver,chrome.driver",ConstantsInFramework.
  getChromeDriverPath()); driver.get("https://gor-pathology.web.app/");
  driver.manage().window().maximize();
  Thread.sleep(2000); test.pass("Navigated to website",MediaEntityBuilder.
  createScreenCaptureFromBase64String(base64()).build()); 
  
  
  
  }
  
  @AfterTest public void tearDown() throws IOException { extent.flush();
  Desktop.getDesktop().browse(new File
  ("reportWithScreenshots/index.html").toURI()); driver.quit(); }
  
  public String base64() { return
  ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64); }
  
  private void highlightElement(WebElement element) {
      JavascriptExecutor js = (JavascriptExecutor) driver;
      // Change the border style and color to highlight the element
      js.executeScript("arguments[0].style.border='3px solid red'", element);
      // Wait for a short duration to see the highlighting effect (you can adjust this)
      try {
          Thread.sleep(1000);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
      // Revert the border style and color back to the original
      js.executeScript("arguments[0].style.border=''", element);
  }
  
  
  }
 