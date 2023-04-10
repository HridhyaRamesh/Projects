//GeoConnect Application

package LoginModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FrmWrk_PageObject.Menu;

public class LoginPage {

	//Declaring global Variables
		private WebDriver driver;


		 public LoginPage(WebDriver driver) {
			this.driver=driver;
		}
		 
//Attributes for logging to the site
 @FindBy(xpath="//input[@type='text']")
 WebElement userName;
 
 @FindBy(css="p-password#password1>div>input")
 WebElement passWord;
 
 @FindBy(xpath="//span[text()='Sign In']")
 WebElement LoginButton;
 
 public WebElement userName(){
		return userName;
		
	}
	
	public WebElement passWord(){
		return passWord;
		
	}
	
	
	public WebElement loginButton(){
		return LoginButton;
		
	}
	
	//send username and password
public Menu loginMCF(){
		
		userName().sendKeys("hridhya.ramesh@speehive.com");
		passWord().sendKeys("Wel@123");
		LoginButton.click();
		return PageFactory.initElements(driver,Menu.class);
		
	}
	
 
}
