package FrmWrk_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PortcallPage {
	
	WebDriver driver;
	public PortcallPage(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(id="Module.PortCall")
	WebElement Portcallmenu;
	
	@FindBy(xpath="//span[text()='NEW']")
	WebElement New_PC;
	
	@FindBy(xpath = "(//div[contains(.,'empty')])[16]")
	WebElement Principal;
	
	 public WebElement Portcallmenu() {
		 return Portcallmenu;
	 }
	
	 
	 public WebElement New_PC() {
		 return New_PC;
	 }
	 
	 public WebElement Principl {
		 String Principal;
	 }
	 
	 public Last Portcall_MCF() throws Exception {
		
			Portcallmenu.click();
			System.out.println("Portcall clicked");
			Thread.sleep(3000);
			New_PC.click();
			System.out.println("New button clicked");
			Thread.sleep(3000);
			Principal.sendKeys("Scorpio");
			return PageFactory.initElements(driver, Last.class);
			
			
		}

}
