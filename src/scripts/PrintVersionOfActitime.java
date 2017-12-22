package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import pompages.ActiTIME_EnterTIMETrack_Page;
import pompages.LoginPage;

public class PrintVersionOfActitime extends BaseTest {
	@Test
	public void testPrintVersionOfActitime(){
		//login in to actitime applicaiton
		
		LoginPage l = new LoginPage(driver);

		//CLick on Help menu
		ActiTIME_EnterTIMETrack_Page a = new ActiTIME_EnterTIMETrack_Page(driver);
		a.clickOnHelpMenu();

		// click on "About your actitime" link
		

		//print product version - actiTIME 2017.4

		//click on Close button on the product info window.

		//click on Logout
	}

}
