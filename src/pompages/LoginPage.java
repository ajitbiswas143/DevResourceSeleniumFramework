package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
	//Declaration of elements
	@FindBy(id="username")
	private WebElement unTB;
	@FindBy(name="pwd")
	private WebElement pwdTB;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBTN;
	//Initialise the elements
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	//Utilisation of Elements
	public void setUsername(String un){
		unTB.sendKeys(un);
	}
	public void setPassword(String pwd){
		pwdTB.sendKeys(pwd);
	}
	public void clickLogin(){
		loginBTN.click();
	}
}
