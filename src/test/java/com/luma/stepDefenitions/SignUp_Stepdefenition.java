package com.luma.stepDefenitions;

import com.luma.initilize.DriverInit;
import com.luma.pages.SignUp_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SignUp_Stepdefenition extends DriverInit{
	
	public static String signupEmail;
	public static String signupPassword;
	
	@Given("^When user is on signup page$")
	public void when_user_is_on_signup_page() throws Throwable {
		SignUp_Page signup = new SignUp_Page(driver);
		signup.openBrowser();
		Thread.sleep(1500);
		SignUp_Page signup1 = new SignUp_Page(driver);
		signup1.homecreateAccountBtn();

	}

	@Then("^Enter the firstName \"([^\"]*)\"$")
	public void enter_the_firstName(String fname) throws Throwable {
		SignUp_Page signup = new SignUp_Page(driver);
		Thread.sleep(4000);
	    signup.enterFName(fname);
	}

	@Then("^Enter the lastName \"([^\"]*)\"$")
	public void enter_the_lastName(String lname) throws Throwable {
		SignUp_Page signup = new SignUp_Page(driver);
		//Thread.sleep(4000);
	    signup.enterLName(lname);

	}

	@Then("^Enter the Email \"([^\"]*)\"$")
	public void enter_the_Email(String email) throws Throwable {
		SignUp_Page signup = new SignUp_Page(driver);
	    signup.enterEmail(email);
	    this.signupEmail=email;
	    

	}

	@Then("^Enter the password \"([^\"]*)\"$")
	public void enter_the_password(String pass) throws Throwable {
		SignUp_Page signup = new SignUp_Page(driver);
	    signup.enterPassword(pass);
	    this.signupPassword = pass;

	}

	@Then("^Enter the confirm password \"([^\"]*)\"$")
	public void enter_the_confirm_password(String conformpassword) throws Throwable {
		SignUp_Page signup = new SignUp_Page(driver);
		Thread.sleep(4000);
	    signup.enterConformPassword(conformpassword);
	}

	@Then("^Click on create account button\\.$")
	public void click_on_create_account_button() throws Throwable {
		SignUp_Page signup = new SignUp_Page(driver);
		Thread.sleep(1000);
	    signup.clickSignUp();
	}

	}


