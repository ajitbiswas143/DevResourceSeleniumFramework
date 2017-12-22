package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTIME_EnterTIMETrack_Page {
	@FindBy(xpath="//div[contains(text(),'Help')]")
	private WebElement helpMenu;
	
	public ActiTIME_EnterTIMETrack_Page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnHelpMenu(){
		helpMenu.click();
	}

}
