package com.leafBot.pages;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods {
	public CreateLead() {		
	}
	
	public CreateLead enterCompanyName(String data) {
		driver.findElementById("createLeadForm_companyName").sendKeys(data);
		return this;	
	}
	
	public CreateLead enterFirstName(String data) {
		driver.findElementById("createLeadForm_firstName").sendKeys(data);
		return this;	
	}
	
	public CreateLead enterLastName(String data) {
		driver.findElementById("createLeadForm_lastName").sendKeys(data);
		return this;	
	}
	
	public ViewLeads clickSubmit() {
		driver.findElementByName("submitButton").click();
		return new ViewLeads();	
	}

}
