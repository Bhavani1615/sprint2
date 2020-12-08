package PageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Framework.SeleniumKeywords;

public class RegistrationPageDWS {
 WebDriver driver;
@FindBy(linkText="Register")
@CacheLookup
public
WebElement registerlink;

@FindBy(id="gender-male")
@CacheLookup
WebElement male;

@FindBy(id="gender-female")
@CacheLookup
WebElement female;
 
@FindBy(xpath="//*[@id='FirstName']")
@CacheLookup
WebElement firstname;

 
 @FindBy(how=How.XPATH,using="//*[@id='LastName']")
 @CacheLookup
 WebElement lastname;
 
 @FindBy(how=How.ID,using="Email")
 @CacheLookup
 WebElement email;
 
 @FindBy(how=How.NAME,using="Password")
 @CacheLookup
 WebElement password;
 
 @FindBy(name="ConfirmPassword")
	@CacheLookup
	WebElement confirmpassword;
 
 @FindBy(id="register-button")
	@CacheLookup
	WebElement registerbutton;
 
 @FindAll({@FindBy(className="text-box single-line")})
 @CacheLookup
 List<WebElement> errormsg;
 
 @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[4]/span[2]/span")
 @CacheLookup
 WebElement emailformaterr;
 
 //constructor
 public RegistrationPageDWS(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
 
 public void setFirstName(String firstname)
 {
	 SeleniumKeywords.sendData(this.firstname, firstname);
 }
 public void setLastName(String lastname)
 {
	 SeleniumKeywords.sendData(this.lastname, lastname);
 }
 public void setEmail(String email)
 {
	 SeleniumKeywords.sendData(this.email, email);
 }
 public void setPassword(String password)
 {
	 SeleniumKeywords.sendData(this.password,password);
 }
 public void setConfirmPassword(String confirmpassword)
 {
	 SeleniumKeywords.sendData(this.confirmpassword, confirmpassword);
 }
 public void setMale()
 {
	 SeleniumKeywords.clickButton(male);
 }
 public void setFemale()
 {
	 SeleniumKeywords.clickButton(female);
 }
 public void submit()
 {
	 SeleniumKeywords.clickButton(registerbutton);
 }
 public List<String> textRegistration()
 {
	 List<String> errText = new ArrayList<String>(); ;
	 for(WebElement var:errormsg)
	 {
		 errText.add(SeleniumKeywords.errorMessage(var));
	 }
	 return(errText);
 }
 
 public void setRegistration(String firstname,String lastname,String email,String password,String confirmpassword,String gender)
 {
	 if(gender.equalsIgnoreCase("male"))
	 {
		 SeleniumKeywords.clickButton(male);
	 }
	 else
	 {
		 SeleniumKeywords.clickButton(female);
	 }
	 SeleniumKeywords.sendData(this.firstname, firstname);
	 SeleniumKeywords.sendData(this.lastname, lastname);
	 SeleniumKeywords.sendData(this.email, email);
	 SeleniumKeywords.sendData(this.password,password);
	 SeleniumKeywords.sendData(this.confirmpassword, confirmpassword);
	 SeleniumKeywords.clickButton(registerbutton);

 }
 public String emailFormat()
 {
	 return(SeleniumKeywords.errorMessage(emailformaterr));
 }

}
