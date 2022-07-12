package testcases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.AccountRegistration;
import pageobjects.HomePage;
import testbase.BaseClass;

public class TC_001AccountRegistration extends BaseClass{


	
	
	
	@Test (groups={"regression", "master"})
	public void test_account_Registration()
	{
		
		logger.info("Starting TC_0011AccountRegistration"); 
		
		logger.info("opening app URL");
		
		driver.get(rb.getString("appURL"));// get url from config file
		
		
		driver.manage().window().maximize();
		
	
	 HomePage hp=new HomePage(driver);
	logger.info("Clicking on MyAccount link...");
	 hp.clickMyAccount();
	 
	logger.info("Clicking on MyRegister link");
	 hp.clickRegister();
	 
	 logger.info("providing user details");
	 AccountRegistration repage=new AccountRegistration(driver);
	
	
	 
	 repage.setFirstName("John");
	logger.info("providing first name"); 
	 
	 repage.setFirstName("Canedy");
	 logger.info("providing last name");
		
	 repage.setemail(randomestring()+"@gmail.com");
	logger.info("Providing email");
		
	repage.settelephone("65656565");
	logger.info("providing telephone number");
	
	repage.setconfirmpassword("abcxyz");
	logger.info("providing password");
	repage.setconfirmpassword("abcxyz");
	logger.info("providing confirm password");
	repage.setPrivacyPolicy();
	logger.info("providing privacy policy");
		
	 repage.clickContinue();
	 logger.info("providing click continue");
		
	String confmsg=repage.getConfirmationMsg();
	
	
	if(confmsg.equals("Your Account Has Been Created!"))
	{
		logger.info("Account registration sucess");
		Assert.assertTrue(true);
	}
	
	else
	{  
		logger.error("Account registration fail");
		Assert.assertTrue(false);
	}
	
	
	logger.info("Account registration is finished"
			+ "");
	
	}

	






















}
