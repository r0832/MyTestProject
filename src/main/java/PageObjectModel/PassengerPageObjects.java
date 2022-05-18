package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PassengerPageObjects {
	public WebDriver driver;
	
	private By passengerList = By.xpath("//div [@id ='divpaxinfo']");
	private By adultAdd = By.xpath("(//span[@id='hrefIncAdt'])");
	private By closeBtnPassenger = By.xpath("//input[@id='btnclosepaxoption']");
	
	public PassengerPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}

	public WebElement PassengerList() {
		return driver.findElement(passengerList);		
	}
	
	public WebElement AdultAdd() {
		return driver.findElement(adultAdd);
		
	}
	
	public WebElement CloseBtnPassenger() {
		return driver.findElement(closeBtnPassenger);
		
	}

}
