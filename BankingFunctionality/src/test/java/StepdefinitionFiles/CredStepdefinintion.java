package StepdefinitionFiles;

import org.pom.LoginPage;
import org.pom.SignupPage;
import org.testng.Assert;
import org.utils.BaseBank;
import org.utils.Constant;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CredStepdefinintion extends BaseBank{
	SignupPage sp;
	LoginPage lp;
	
	@Given("launch the url")
	public void launch_the_url() {
		readPropertyFile();
		openBrowser(Constant.BROWSER);
	    launchUrl(Constant.URL);
	}

	@When("click the signUp button")
	public void click_the_signUp_button() {
	   sp = new SignupPage();
	   hoverCursorClick(sp.getSignUpLink());
	}

	@Then("enter the {string} and {string}")
	public void enter_the_and(String usName, String psWord) {
		   passInput(sp.getCrtUser(),usName );
		   passInput(sp.getCrtPasswrd(), psWord);
	   
	}
	@Then("verify the account is created")
	public void verify_the_account_is_created() {
	    String msg = alertMsg();
	    
	    boolean contains = msg.contains("successful");
	    Assert.assertTrue(contains, excelWrite("Task1", 3, 0, msg));
	}


	@Then("click the signUp submit button")
	public void click_the_signUp_submit_button() {
	    clickButton(sp.getSignupSubmit());
	}

	@When("click the loginPage")
	public void click_the_loginPage() {
		lp = new LoginPage();
	    hoverCursorClick(lp.getLoginLink());
	}
	
	@Then("pass the {string} and {string}")
	public void pass_the_and(String string, String string2) {
	    passInput(lp.getUserName(), string);
	    passInput(lp.getPassword(), string2);
	}

	@Then("click the logIn button")
	public void click_the_logIn_button() {
	    clickButton(lp.getSubmitBtn());
	}
	@Then("verify whether logged in")
	public void verify_whether_logged_in() {
		boolean display = isDisplay(lp.getUserVerify());
	   Assert.assertTrue(display, "Invalid Credentials");
	}


}
