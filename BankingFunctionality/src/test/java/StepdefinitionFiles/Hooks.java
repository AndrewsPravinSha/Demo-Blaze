package StepdefinitionFiles;

import org.utils.BaseBank;
import org.utils.Constant;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseBank{
	
	@Before
	private void browserIn() {
		readPropertyFile();
		openBrowser(Constant.BROWSER);
	}
	
	@After
	private void tearDown() {
		closeBrowser();		
	}

}
