package com.pageObject;

import org.openqa.selenium.WebElement;

public class DashboardPageObject {
	public final String toDo="//div[@class='jss73']";
	public final String dashBoardTitle="//div[contains(text(),'Dashboard')]";
	public final String addTestButton="//input[@id='patient-test']";

	public final String discountButton="//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input']";
	
	
	public void dropdown(String d) {
		d= dashBoardTitle ;
	}
}
