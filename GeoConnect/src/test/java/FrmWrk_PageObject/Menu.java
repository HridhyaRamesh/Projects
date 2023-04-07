package FrmWrk_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu {
	
	WebDriver driver;
	public Menu(WebDriver driver) {
		this.driver=driver;
	}
	

	@FindBy(className="menu-icon")
	WebElement Menu;
	 
	
	
	
	
	public WebElement Menu_button(){
		return Menu;
	}
	
	
	public PortcallPage Menu_MCF() throws Exception {
		Menu.click();
		Thread.sleep(3000);
		System.out.println("successfully clicked menu");
		
		return PageFactory.initElements(driver, PortcallPage.class);
	}

}
