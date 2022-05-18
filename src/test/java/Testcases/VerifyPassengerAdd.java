package Testcases;

import org.testng.annotations.Test;

import PageObjectModel.PassengerPageObjects;
import resources.Baseclass;

public class VerifyPassengerAdd extends Baseclass {
	@ Test
	public void AdultPassengerAddViewAlert() {
		PassengerPageObjects ppo = new PassengerPageObjects(driver);
		
		ppo.PassengerList().click();
		
		for (int i=0; i<9 ; i++) {
			
			ppo.AdultAdd().click();
						
		}
		
		driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		ppo.PassengerList().getText();
		
		if(ppo.PassengerList().getText().equalsIgnoreCase("9Adult")) {
			
			System.out.println("Message: Maximum 9 adult message is displayed");
		}
		
        ppo.CloseBtnPassenger().click();
				
		
	}

}
