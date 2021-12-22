package StepdefinitionFiles;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.pom.HomePage;
import org.pom.PlaceOrderPage;
import org.testng.Assert;
import org.utils.BaseBank;
import org.utils.Constant;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProdStepdefinition extends BaseBank {
HomePage hp;
	@When("Adding a product to Cart")
	public void adding_a_product_to_Cart() {
		readPropertyFile();
	    launchUrl(Constant.URL);
	    hp = new HomePage();
		clickButton(hp.getLaptopLink());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		List<WebElement> list = hp.getProdLink();
		for (WebElement lap : list) {
			String text = lap.getText();
			while (text.contains("Pro")) {
				lap.click();
				break;
			}
		}
		PlaceOrderPage po = new PlaceOrderPage();
		explicitlyWaitVisible(po.getPriceTag());
		System.out.println(po.getPriceTag().getText());
		jsClick(po.getAddtoCart());
	    
	}

	@Then("checking whether the product is Added in cart")
	public void checking_whether_the_product_is_Added_in_cart() {
		PlaceOrderPage po = new PlaceOrderPage();
	    clickButton(hp.getCartLink());
	    List<WebElement> list = explicitlyWaitAllVisible(po.getCartDetails());
	    boolean contains = false;
	    for (WebElement lap : list) {
			contains = lap.getText().contains("Pro");
		}
	    Assert.assertTrue(contains, "Product not added");
	    
	}

	@Then("product is deleted")
	public void product_is_deleted() {
	   
	}

	@Then("check whether the product is deleted")
	public void check_whether_the_product_is_deleted() {
	   
	}

	@When("entering the details")
	public void entering_the_details() {
	    
	}

	@Then("place the order in cart")
	public void place_the_order_in_cart() {
	   
	}

	@Then("print out the Generated id")
	public void print_out_the_Generated_id() {
	    
	}



}
