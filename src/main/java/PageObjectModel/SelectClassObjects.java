package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectClassObjects {
	public WebDriver driver;
	
	private By currencyValue = By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']");
	
	public SelectClassObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver2;
	}

	public WebElement CurrencyValue() {
		return driver.findElement(currencyValue);
		
	}
	

}
