package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Framework.SeleniumKeywords;

public class ShoppingCartPage {
	WebDriver driver;
	
	//identifying elements using different locators
	@FindBy(name="removefromcart")
	@CacheLookup
	WebElement remove; 
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[1]/div/input[1]")
	@CacheLookup
	WebElement update;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div[2]/div[2]/div")
	@CacheLookup
	WebElement msg;
	
	//Constructor
	public ShoppingCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void removeItem()
	{
		SeleniumKeywords.clickButton(remove);
	}
	public void updateCart()
	{
		SeleniumKeywords.clickButton(update);
	}
	public String cartMessage()
	{
		return(SeleniumKeywords.errorMessage(msg));
	}

}
