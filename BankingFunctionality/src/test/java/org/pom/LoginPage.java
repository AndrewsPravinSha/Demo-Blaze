package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utils.BaseBank;

public class LoginPage extends BaseBank{

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({
		@FindBy(id="login2"),
		@FindBy(xpath="(//a[@data-toggle=\"modal\"])[3]"),
		@FindBy(xpath="//a[text()='Log in']")
	})
	private WebElement loginLink;
			
	@FindBy(id="loginusername")
	private WebElement userName;
	
	@FindBy(id="loginpassword")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement submitBtn;
	
	@FindBy(xpath="(//button[text()='Close'])[3]")
	private WebElement closeBtn;
	
	@FindBy(id="nameofuser")
	private WebElement userVerify;

	public WebElement getUserVerify() {
		return userVerify;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getCloseBtn() {
		return closeBtn;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}
	

}
