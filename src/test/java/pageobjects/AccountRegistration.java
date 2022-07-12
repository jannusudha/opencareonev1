package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountRegistration {

   WebDriver driver;
   
  public AccountRegistration(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }

   @FindBy(name="firsntname")
   WebElement txtFirstname;

   @FindBy(name="lastname")
   WebElement txtlastname;
   
   @FindBy(name="email")
   WebElement txtemail;
   
   @FindBy(name="telephone")
   WebElement txttelephone;
   
   @FindBy(name="password")
   WebElement txtpassword;
   
   @FindBy(name="confirmpassword")
   WebElement txtconfirmpassword;
   
  @FindBy(name="agree")
  WebElement checkedpolicy;
 
  @FindBy(xpath="(//button[normalize-space()='Continue'])[1]")
  WebElement Continue;

  @FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

  public void setFirstName(String fname)
	{
		txtFirstname.sendKeys(fname);
	}

  public void setlastname(String lastname)

  {
	  txtlastname.sendKeys(lastname);
  }

  public void setemail(String email)
  {
	  txtemail.sendKeys(email);
  }

  public void settelephone(String telephone)
  {
	  txttelephone.sendKeys(telephone);
  }

 public void setpassword(String password)
 {
	 txtpassword.sendKeys(password);
 }


public void setconfirmpassword(String confirmpwd)
{
	txtconfirmpassword.sendKeys(confirmpwd);
}

public void setPrivacyPolicy()
{
	checkedpolicy.click();
}

public void clickContinue()
{
	Continue.click();
}
public String getConfirmationMsg()
{
	try
	{
	return (msgConfirmation.getText());
	}
	catch(Exception e)
	{
		return(e.getMessage());
	}
}




}
