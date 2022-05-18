package Testcases;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.SelectClassObjects;
import resources.Baseclass;

public class VerifySelectClass extends Baseclass {
	@Test
	
	public void selectcurrencyValue() {
		
		SelectClassObjects sco = new SelectClassObjects(driver);

		Select s = new Select(sco.CurrencyValue());
		s.selectByIndex(0);
		
	}

}
