package com.leafBot.pages;

import com.leafBot.testng.api.base.ProjectSpecificMethods;
import com.leafBot.pages.HomePage;

import org.openqa.selenium.WebElement;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage() { 
	}

	public LoginPage enterUsername(String data) {
		WebElement username = locateElement ("id","username");
		clearAndType(username,data);
		return this;
	}

	public LoginPage enterPassword(String data) {
		WebElement password = locateElement ("id","password");
		clearAndType(password,data);
		return this;
	}
	
	public HomePage clickLogin() {
		WebElement login = locateElement ("LinkText","login");
		click(login);
		return new HomePage();

}}
