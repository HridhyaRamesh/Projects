package FrmWrk_TestCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import FrmWrk_EnvSetup.EnvironmentSetup;
import FrmWrk_PageObject.LoginPage;

public class TestMCF_PageObject extends EnvironmentSetup {
	
LoginPage page;
	
	

	@BeforeClass
	public void setup() {


		setDriver("chrome", "https://geoconnect-qa.azurewebsites.net/#/account/login");
		driver = getDriver();
		page = PageFactory.initElements(driver, LoginPage.class);
		//1st it is giving value for Constructor
		//its init the webelements
		//its returning a page object
		
		driver.manage().window().maximize();
	}
	@Test
	public void test_MCF_PO_PF() throws Exception {
	
		
		page.loginMCF().Menu_MCF().Portcall_MCF().success();
	}
	

	@AfterClass
	public void close() {

		quitBrowser();
		 
	}

}
