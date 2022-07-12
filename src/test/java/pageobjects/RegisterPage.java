package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	WebDriver driver;
	
	public RegisterPage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
     
     @FindBy(name="firstname")
     WebElement txtusername;
     
     @FindBy(name="lastname")
     WebElement txtlastname;
     
     @FindBy(name="email")
     WebElement txtEmail;
     
     @FindBy(name="telephone")
	 WebElement txttelephone;
     
     @FindBy(name="password")
     WebElement txtPassword;
	
	@FindBy(name="passwordconfirm")
	WebElement txtconfirm;
	
	@FindBy(name="agree")
	WebElement chkdPolicy;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;
	
	public void setFirstname(String fname)
	{
		txtusername.click();
	}
	
	public void setlastname(String lastname)
	{
		txtlastname.click();
	}
	
	public void setemail(String Email)
	{
		txtEmail.sendKeys();
	}
	
	public void settelephone(String telephone)
	{
		txttelephone.sendKeys(telephone);
		
	}
	
	public void setpassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void setconfirm(String confirmpassword)
	{
		txtconfirm.sendKeys("confirm");
	}
	
	public void setPrivacyPolicy()
	{
		chkdPolicy.click();
	}
	
	public void clickContinue()
	{
		btnContinue.click();
	}

	public String getConfirmationMsg()
	{
		try
		{
		return (txtconfirm.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
	
	
	
	
	
	
}
