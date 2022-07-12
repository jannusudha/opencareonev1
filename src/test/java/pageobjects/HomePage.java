package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

 WebDriver driver;
 
 public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
 
@FindBy(xpath="//span[normalize-space()='My Account']")
WebElement InkMyAccount;
 
 @FindBy(linkText="Register")
 WebElement InkRegister;

  
 @FindBy(linkText="login")
 WebElement InkLogin;



public void clickMyAccount()
{
	InkMyAccount.click();
}

public void clickRegister()
{
	InkRegister.click();
}

 public void clicklogin()
 {
	 InkLogin.click();
 }

}
