package org.pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utils.BaseBank;

public class HomePage extends BaseBank {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({
		@FindBy(xpath="//a[text()='Phones']"),
		@FindBy(xpath="//a[@onclick=\"byCat('phone')\"]")
	})
	private WebElement phoneLink;
	
	@FindAll({
		@FindBy(xpath="//a[text()='Laptops']"),
		@FindBy(xpath="//a[@onclick=\"byCat('notebook')\"]")
	})
	private WebElement laptopLink;
	
	@FindAll({
		@FindBy(xpath="//a[text()='Monitors']"),
		@FindBy(xpath="//a[@onclick=\"byCat('monitor')\"]")
	})
	private WebElement monitorLink;
	
	@FindBy(xpath="//a[text()='Contact']")
	private WebElement contactLink;
	
	@FindBy(xpath="//a[text()='Sign up']")
	private WebElement signUpLink;
	
	@FindAll({
		@FindBy(id="login2"),
		@FindBy(xpath="(//a[@data-toggle=\"modal\"])[3]"),
		@FindBy(xpath="//a[text()='Log in']")
	})
	private WebElement loginLink;
	
	@FindBy(xpath="//a[text()='Cart']")
	private WebElement cartLink;
	
	@FindBy(xpath="//a[text()='About us']")
	private WebElement aboutLink;
	
	@FindAll({
		@FindBy(xpath="//a[text()]")	
	})
	private List<WebElement> totalLinks;
	
	@FindAll({
		@FindBy(xpath = "//a[contains(@href,'prod') and text()]"),
		@FindBy(xpath = "//a[contains(@class,'hrefch') and text()]")
	})
	private List<WebElement> prodLink;
	
	@FindAll({
		@FindBy(xpath = "//a[text()='Add to cart']"),
		@FindBy(xpath = "(//a[@onclick])[2]")
	})
	private WebElement addtoCart;
	
	@FindBy(xpath = "//h3[text()]")
	private WebElement priceTag;
	
	@FindBy(xpath = "//a[text()='Home ']")
	private WebElement homeLink;

	public WebElement getHomeLink() {
		return homeLink;
	}

	public WebElement getAddtoCart() {
		return addtoCart;
	}

	public WebElement getPriceTag() {
		return priceTag;
	}

	public List<WebElement> getProdLink() {
		return prodLink;
	}

	public WebElement getPhoneLink() {
		return phoneLink;
	}

	public WebElement getLaptopLink() {
		return laptopLink;
	}

	public WebElement getMonitorLink() {
		return monitorLink;
	}

	public WebElement getContactLink() {
		return contactLink;
	}

	public WebElement getSignUpLink() {
		return signUpLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getCartLink() {
		return cartLink;
	}

	public WebElement getAboutLink() {
		return aboutLink;
	}

	public List<WebElement> getTotalLinks() {
		return totalLinks;
	}

}
