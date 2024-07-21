package com.luma.stepDefenitions;

import com.luma.initilize.DriverInit;
import com.luma.pages.Login_Page;
import com.luma.pages.SignUp_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login_Stepdefenition extends DriverInit{
	
	

	@Given("^when click on the Login button$")
	public void when_click_on_the_Login_button() throws Throwable {
		SignUp_Page signup = new SignUp_Page(driver);
		signup.openBrowser();
		Login_Page login = new Login_Page(driver);
		login.loginMenuBtn();
	}

	
	@Then("^Enter the Email address$")
	public void enter_the_Email_address() throws Throwable {
		
		Login_Page login = new Login_Page(driver);
		login.enterEmail(SignUp_Stepdefenition.signupEmail);
	}

	@Then("^Enter the Passoword$")
	public void enter_the_Passoword() throws Throwable {
		Login_Page login = new Login_Page(driver);
		login.enterPassowrd(SignUp_Stepdefenition.signupPassword);
	}

	@Then("^click on sign in button$")
	public void click_on_sign_in_button() throws Throwable {
		Login_Page login = new Login_Page(driver);
		login.enterSign();
	   
	}

	}


