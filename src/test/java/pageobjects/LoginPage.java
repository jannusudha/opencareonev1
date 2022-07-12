package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	 public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	 @FindBy(xpath="//input[@id='input-email']")
	 WebElement txtEmailAddress;

    @FindBy(xpath="//input[@id='input-password']")
    WebElement txtPasswordAddress;
    
    @FindBy(xpath="//button[@type='submit']")
    WebElement txtloginbutton;
    
    @FindBy(xpath="//h2[text()='My Account']")
	WebElement msgHeading;
    
    public void setEmail(String Email)
    {
    	txtEmailAddress.sendKeys(Email);
    }

  public void setpassword(String password)
  {
	  txtPasswordAddress.sendKeys(password);
  }

  public void clicklogin()
  {
	  txtloginbutton.click();
  }


  public  boolean isMyAccountPageExists()
  {
  try
  {
	  return (msgHeading.isDisplayed());
  }
	 
  catch(Exception e)
	{
		return(false);
	}
  
  
  }
  
 





}
