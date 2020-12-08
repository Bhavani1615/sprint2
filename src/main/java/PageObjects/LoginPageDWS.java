package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Framework.SeleniumKeywords;

public class LoginPageDWS {
 WebDriver driver;
 //identifying elements using different locators
    @FindBy(id="Email")
	@CacheLookup
	WebElement emailid;
    
    @FindBy(linkText="Log in")
	@CacheLookup
	public
	WebElement login;
    
    @FindBy(how=How.NAME, using="Password")
	@CacheLookup
	WebElement password;
    
    @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	@CacheLookup
	WebElement loginbutton;
    
    @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/span")
    @CacheLookup
    WebElement errormsg;
    
    //constructor
    public LoginPageDWS(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
    //Actions
    public void setEmail(String emailid)
    {
    	SeleniumKeywords.sendData(this.emailid, emailid);
    }
    
    public void setPassword(String password)
    {
    	SeleniumKeywords.sendData(this.password, password);
    }
     
    public void submit()
    {
    	SeleniumKeywords.clickButton(loginbutton);
    }
    
    public String textMessage()
    {
    	return(SeleniumKeywords.errorMessage(errormsg));
    	
    }
    public void successfullogin(String emailid,String password)
    {
    	SeleniumKeywords.sendData(this.emailid, emailid);
    	SeleniumKeywords.sendData(this.password, password);
    	loginbutton.click();
    	
    }
    public void clickLogin()
    {
    	SeleniumKeywords.clickButton(login);
    }
 
}
