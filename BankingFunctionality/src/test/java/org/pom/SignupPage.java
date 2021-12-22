package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utils.BaseBank;

public class SignupPage extends BaseBank{
	
	public SignupPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="sign-username")
	private WebElement crtUser;
	
	@FindBy(id="sign-password")
	private WebElement crtPasswrd;
	
	@FindBy(xpath="//button[text()='Sign up']")
	private WebElement signupSubmit;
	
	@FindBy(xpath="//a[text()='Sign up']")
	private WebElement signUpLink;

	public WebElement getSignUpLink() {
		return signUpLink;
	}

	public WebElement getCrtUser() {
		return crtUser;
	}

	public WebElement getCrtPasswrd() {
		return crtPasswrd;
	}

	public WebElement getSignupSubmit() {
		return signupSubmit;
	}
	

}
