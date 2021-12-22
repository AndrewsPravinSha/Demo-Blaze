package org.runner;

import org.testng.annotations.Test;
import org.utils.BaseBank;
import org.utils.Constant;

public class Spare extends BaseBank{

	@Test
	private void tc1() {
		readPropertyFile();
		openBrowser(Constant.BROWSER);
	}
	
}
