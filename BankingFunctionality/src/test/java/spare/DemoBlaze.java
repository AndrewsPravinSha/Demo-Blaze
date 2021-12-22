package spare;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.pom.HomePage;
import org.pom.LoginPage;
import org.pom.PlaceOrderPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.utils.BaseBank;
import org.utils.Constant;


public class DemoBlaze extends BaseBank{
	HomePage hp;
	@BeforeClass
	private void setup() {
		readPropertyFile();
		openBrowser(Constant.BROWSER);
		launchUrl(Constant.URL);
	}
	
	/*
	 * @AfterClass private void tearDown() { closeBrowser();
	 */
	
	@Test
	private void tc1() {
		
		LoginPage lp = new LoginPage();
		hoverCursorClick(lp.getLoginLink());
		jsSendKeys(lp.getUserName(), "king232");
		jsSendKeys(lp.getPassword(), "king232");
		jsClick(lp.getSubmitBtn());
		WebElement visible = explicitlyWaitVisible(lp.getUserVerify());
		boolean display = visible.isDisplayed();
		Assert.assertTrue(display, "invalid");
	}
	
	@Test
	private void tc2()  {
		hp = new HomePage();
		clickButton(hp.getLaptopLink());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		List<WebElement> list = hp.getProdLink();
		System.out.println(list.size());
		for (WebElement lap : list) {
			String text = lap.getText();
			while (text.contains("Pro")) {
				lap.click();
				break;
			}
		}
		PlaceOrderPage po = new PlaceOrderPage();
		explicitlyWaitVisible(hp.getPriceTag());
		System.out.println(hp.getPriceTag().getText());
		jsClick(hp.getAddtoCart());
		
		//acceptAlert();
		jsClick(hp.getCartLink());
		jsClick(po.getPlaceOrderBtn());
		String det ="dummy";
		jsSendKeys(po.getPlName(), det);
		jsSendKeys(po.getPlCity(), det);
		jsSendKeys(po.getPlCountry(), det);
		jsSendKeys(po.getPlMonth(), det);
		jsSendKeys(po.getPlCcard(), det);
		jsSendKeys(po.getPlYear(), det);
		jsClick(po.getPurchaseBtn());
		WebElement visible = explicitlyWaitVisible(po.getInvoice());
		System.out.println(visible.getText());
		jsClick(po.getPurchaseOk());
		hoverCursorClick(hp.getHomeLink());
		
		
	}
	
	@Test
	private void tc3() {
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
		
		clickButton(hp.getCartLink());
		List<WebElement> prod = explicitlyWaitAllVisible(po.getCartDetails());
	    boolean contains = false;
	    for (WebElement lap : prod) {
			contains = lap.getText().contains("Pro");
		}
	    Assert.assertTrue(contains, "Product not added");
		
	}
	
	@Test
	private void tc4() {
		hp = new HomePage();
		clickButton(hp.getPhoneLink());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		List<WebElement> link = hp.getProdLink();
		for (WebElement phone : link) {
			while (phone.getText().contains("")) {
				phone.click();
				break;
			}
		}
		PlaceOrderPage po = new PlaceOrderPage();
		WebElement price = explicitlyWaitVisible(po.getPriceTag());
		System.out.println(price.getText());
		jsClick(po.getAddtoCart());
		jsClick(hp.getCartLink());
		WebElement visible = explicitlyWaitVisible(po.getDeleteOrder());
		hoverCursorClick(visible);
	}
}
