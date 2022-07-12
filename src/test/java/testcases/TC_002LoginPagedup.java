package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.LoginPage;
import testbase.BaseClass;

public class TC_002LoginPagedup extends BaseClass{

	@Test(groups= {"sanity", "master"})
	public void test_login1()
	{
		logger.info("Starting TC_002LoginPagedup");
	
	
	 
		  driver.get(rb.getString("aPPURL"));
	      logger.info("Home Page Displayed");
	      
	      driver.manage().window().maximize();
	      
	      HomePage hp=new HomePage(driver);
	      hp.clickMyAccount();
	   logger.info("Clicked on My Account");
	   hp.clicklogin();
	   logger.info("Clicked on Login");
	   
	  try
	  {
	     LoginPage Ip=new LoginPage(driver); 
	     
	     Ip.setEmail(rb.getString("email"));
	     logger.info("provided email");
	     
	     Ip.setpassword(rb.getString("password"));
	     logger.info("provided password");
	     
	     Ip.clicklogin();
	     logger.info("Clicked on login");
	 
	  
	    boolean targetpage=Ip.isMyAccountPageExists();
	  
	     if(targetpage)
	    	 
	     {
	    	 logger.info("Login Sucess");
	         Assert.assertTrue(true);
	        
	     }
	  
	     else
	     {
	    	 logger.error("Login Failed");
	    	 //captureScreen(driver,  test_login1);
	        Assert.assertFalse(false);
	     }
	  
	  } 
	   
	     catch(Exception e)
			{
				logger.fatal("Login Failed ");
				Assert.fail();
			}
			
			logger.info(" Finished TC_002_Login ");
	  
	  }
}