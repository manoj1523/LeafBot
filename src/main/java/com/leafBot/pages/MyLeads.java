package com.leafBot.pages;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class MyLeads extends ProjectSpecificMethods {
	public MyLeads() {		
	}
	
	public CreateLead clickLeads() {
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLead();	
	}
	
}
