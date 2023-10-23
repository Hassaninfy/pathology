package com.constant;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import com.pageObject.LoginPageObject;

//import com.test.orangeFramework.BaseTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//public class DataDriven extends BaseTest() {
	public class DataDriven { 
		LoginPageObject obj =new LoginPageObject();
     public void fetchData() throws IOException {
        // Set the path to the Excel file
        //String excelFilePath = ("user.dir")+ "/orangeFramework/testData/TestData.xlsx";
    	 String excelFilePath = "D:\\EclipseWorkspace\\orangeFramework\\testData\\TestData.xlsx";
        // Load the Excel file
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
        Workbook workbook = new XSSFWorkbook(inputStream);

        // Assuming the user id is in the first column and password in the second column of the first sheet
        Sheet sheet = workbook.getSheetAt(0);

        // Assuming the first row contains headers, so start from the second row
        for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
            Row row = sheet.getRow(rowIndex);
            Cell userIdCell = row.getCell(0); // Assuming user id is in the first column
            Cell passwordCell = row.getCell(1); // Assuming password is in the second column

            // Get user id and password from Excel cells
            String userId = userIdCell.getStringCellValue();
            String password = passwordCell.getStringCellValue();

            // Perform operations with userId and password here
         //   driver.findElement(By.xpath(obj.loginText)).sendKeys(userId);
    	//	driver.findElement(By.xpath(obj.passworText)).sendKeys(password);
    	//	driver.findElement(By.xpath(obj.passworText)).click();
            // Optional: Wait for a few seconds to see the actions being performed
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Close the Excel workbook
        workbook.close();
        inputStream.close();
    }
}
