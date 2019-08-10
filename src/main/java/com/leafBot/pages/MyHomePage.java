package com.leafBot.pages;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	public MyHomePage() {		
	}
	
	public MyLeads clickLeads() {
		driver.findElementByLinkText("Leads").click();
		return new MyLeads();	
	}
}
