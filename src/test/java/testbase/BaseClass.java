package testbase;

import java.time.Duration;
import java.util.ResourceBundle;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	

	public WebDriver driver;
	public Logger logger;
	public ResourceBundle rb;
	
	
	@BeforeClass(groups= {"master","sanity","Regression"})
	@Parameters({"browser"})
	public void setup(String br)
	{ 
		//load config.properties
		
		rb=ResourceBundle.getBundle("config");
		
		
		
		//logging
		
	logger=LogManager.getLogger(this.getClass());
		
		
		//driver
	 if(br.equals("chrome"))
	 {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		logger.info("Laughed Chrome Browser");
	 }	
		
	 else if(br.equals("edge"))
	 {
		 WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			logger.info("Laughed Edge Browser");
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	
	
	}
	
	@AfterClass (groups= {"master","sanity","Regression"})
	public void tearDown()
	{
	driver.close();
	}
	
	

	public String randomestring() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return (generatedString);
	}
	
	public int randomeNumber() {
		String generatedString2 = RandomStringUtils.randomNumeric(5);
		return (Integer.parseInt(generatedString2));
	}
	
	
	

}
