package testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import testbase.BaseClass;
import utilities.XLUtilityFile;

public class TC_003_LoginDDT extends BaseClass();
	
@Test(dataProvider="LoginData")
	public void test_LoginDDT(String email, String password, String exp);
{
	
    logger.info("Starting TC_003_LoginDDT");
 
    
    try
    {
    	driver.get(rb.getString("appURL"));
    	logger.info("Home Page Displayed");
   
      driver.manage().window().maximize();
    
    HomePage hp=new HomePage(driver);
    hp.clickMyAccount();
    logger.info("Clicked on MyAccount");
    hp.clicklogin();
    logger.info("Clicked on Login");   
    
    }









   

@DataProvider(name="LoginData")
public String[][] getData() throws IOException

{
	String path=".\\testData\\opencareonev1_LoginData.xlsx";

   XLUtility xlutil=new  XLUtility(path);  

 int totalrows=xlutil.getRowsCount("Sheet1");
 int totalcolumns=xlutil.getCellCount("Sheet1");
 
 String  logindata[][]=new String[totalrows][totalcolumns];

for(int i=1; i<=totalrows;i++)
{
	for (int j=0;j<=totalcolumns;j++);
	{
		logindata[i-1][j]=xlutil.getCellData("Sheet1", i,j);
	}
}


 return logindata();






}


























}
