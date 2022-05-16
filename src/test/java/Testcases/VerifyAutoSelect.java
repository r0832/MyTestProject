package Testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.AutoSelectObjects;
import PageObjectModel.HomePageObjects;
import resources.Baseclass;

public class VerifyAutoSelect extends Baseclass {
	@Test
public void selectorclass() {
	
		AutoSelectObjects aso = new AutoSelectObjects(driver);
		aso.AutoSelect().sendKeys("ind");
		
		// To find India from select
	
		System.out.println(aso.ListItems().size());
		
		for ( WebElement b : aso.ListItems()) {
			if(b.getText().equalsIgnoreCase("India")) {
				b.click();
				break;	
			
		}
	
}
	}
}

