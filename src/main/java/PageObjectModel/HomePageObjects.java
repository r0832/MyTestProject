package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {
public WebDriver driver;

private By selectdropdown = By.xpath("//select[@id='dropdown-class-example']");

public HomePageObjects(WebDriver driver2) {
	// TODO Auto-generated constructor stub
	this.driver = driver2;
	
}

public WebElement dropdownSelect() {
	return driver.findElement(selectdropdown);
	
}



}
