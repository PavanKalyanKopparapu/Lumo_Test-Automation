package com.luma.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.initilize.DriverInit;

public class Login_Page {

public WebDriver driver;
	
	public Login_Page (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

}
	@FindBy(xpath="//div[@class='panel header'] /ul /li[2]")
	WebElement homesignInBtn;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="pass")
	WebElement pass;
	
	@FindBy(id="send2")
	WebElement signInBtn;
	
	
    
	public void loginMenuBtn() {
		homesignInBtn.click();
	}
	public void enterEmail(String Email) {
		email.sendKeys(Email);	
	}
	
	public void enterPassowrd(String pass2) {
		pass.sendKeys(pass2);
    }
	public void enterSign() {
		signInBtn.click();
	
	
}

}
