package com.luma.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.luma.initilize.DriverInit;

public class SignUp_Page {	
	
	public WebDriver driver;
	
	public SignUp_Page (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div[@class='panel header'] /ul /li[3] /a")
	WebElement homeSignUpBtn;
	
	@FindBy(id="firstname")
	WebElement fname;
	
	@FindBy(id="lastname")
	WebElement lname;
	
	@FindBy(id="email_address")
	WebElement email;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="password-confirmation")
	WebElement conformpassword;
	
	@FindBy(xpath="//div[@class='primary'] /button")
	WebElement createAccountBtn;
	
	@FindBy(xpath="//div[@class='messages']")
	WebElement errormsg;
	
	
	
	
	public void openBrowser() {
		DriverInit.launchBrowser();	
		
	}
	
	public void homecreateAccountBtn() {
		homeSignUpBtn.click();
	}
	
	public void enterFName(String fName) {
		fname.sendKeys(fName);
	}
	
	public void enterLName(String lName) {
		lname.sendKeys(lName);
	}
	
	public void enterEmail(String Email) {
		email.sendKeys(Email);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void enterConformPassword(String conpass) {
		conformpassword.sendKeys(conpass);
	}
	
	public void clickSignUp() {
		createAccountBtn.click();
	String message =errormsg.getText();
	System.out.println(message);
		
		
	}

	
	
	
	
	
	

}
