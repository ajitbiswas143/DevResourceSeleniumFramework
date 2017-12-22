package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;

public class TestInvalidLogin extends BaseTest {
	@Test
	public void testInvalidLogin() throws InterruptedException{
		
		LoginPage l = new LoginPage(driver);
		int rowCount = Lib.getRowCount(EXCEL_PATH, "InvalidLogin");
		for (int i = 1; i < rowCount; i++) {
			
			String username = Lib.getCellValue(EXCEL_PATH, "InvalidLogin", i, 0);
			String password = Lib.getCellValue(EXCEL_PATH, "InvalidLogin", i, 1);
			//enter "admin" in username text box
			l.setUsername(username);
			//enter "manager" in password text box
			l.setPassword(password);
			//click on Login button
			l.clickLogin();
		}
	}
}
