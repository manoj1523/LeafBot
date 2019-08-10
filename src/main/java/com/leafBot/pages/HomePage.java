package com.leafBot.pages;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

	public HomePage() { // Pagefactory code
	}
	
	public MyHomePage clickCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();
	}

public LoginPage clickLogout() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage();
	} 
}
