package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class AutoSelectObjects {
	
	public WebDriver driver;
	
	private By autoSelect = By.xpath("//input[@id='autosuggest']");
	private By listItems = By.xpath("//li[@class='ui-menu-item']");
	
	public AutoSelectObjects(WebDriver driver2) {
		
		// TODO Auto-generated constructor stub
		
		this.driver = driver2;
	}

	public WebElement AutoSelect() {		
		return driver.findElement(autoSelect);
	}


	public List<WebElement>  ListItems() {
		return  driver.findElements(listItems);
	}
	

}
