package org.pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utils.BaseBank;

public class PlaceOrderPage extends BaseBank{

	public PlaceOrderPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Place Order']")
	private WebElement placeOrderBtn;
	
	@FindBy(id="name")
	private WebElement plName;
	
	@FindBy(id="country")
	private WebElement plCountry;
	
	@FindBy(id="city")
	private WebElement plCity;
	
	@FindBy(id="card")
	private WebElement plCcard;
	
	@FindBy(id="month")
	private WebElement plMonth;
	
	@FindBy(id="year")
	private WebElement plYear;
	
	@FindBy(xpath="(//button[text()='Close'])[3]")
	private WebElement plCloseBtn;
	
	@FindBy(xpath="//button[text()='Purchase']")
	private WebElement purchaseBtn;
	
	@FindAll({
		@FindBy(xpath = "//a[text()='Add to cart']"),
		@FindBy(xpath = "(//a[@onclick])[2]")
	})
	private WebElement addtoCart;
	
	@FindBy(xpath = "//td")
	private List<WebElement> cartDetails;
	
	@FindAll({
		@FindBy(xpath = "//h3[text()]"),
		@FindBy(xpath = "//h3[contains(@class,'price')]")
	})
	private WebElement priceTag;
	
	@FindBy(xpath="//p[@class='lead text-muted ']")
	private WebElement invoice;
	
	@FindBy(id="totalp")
	private WebElement totalPrice;
	
	@FindBy(xpath="//a[text()='Delete']")
	private WebElement deleteOrder;
	
	@FindBy(xpath = "//button[text()='OK']")
	private WebElement purchaseOk;

	public WebElement getPurchaseOk() {
		return purchaseOk;
	}

	public WebElement getTotalPrice() {
		return totalPrice;
	}

	public WebElement getDeleteOrder() {
		return deleteOrder;
	}

	public List<WebElement> getCartDetails() {
		return cartDetails;
	}

	public WebElement getInvoice() {
		return invoice;
	}

	public WebElement getPriceTag() {
		return priceTag;
	}

	public WebElement getAddtoCart() {
		return addtoCart;
	}

	public WebElement getPlaceOrderBtn() {
		return placeOrderBtn;
	}

	public WebElement getPlName() {
		return plName;
	}

	public WebElement getPlCountry() {
		return plCountry;
	}

	public WebElement getPlCity() {
		return plCity;
	}

	public WebElement getPlCcard() {
		return plCcard;
	}

	public WebElement getPlMonth() {
		return plMonth;
	}

	public WebElement getPlYear() {
		return plYear;
	}

	public WebElement getPlCloseBtn() {
		return plCloseBtn;
	}

	public WebElement getPurchaseBtn() {
		return purchaseBtn;
	}
	
	

}
