package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;

public class TestValidLogin extends BaseTest{
	@Test
	public void testValidLogin(){
		LoginPage l = new LoginPage(driver);
		int rowCount = Lib.getRowCount(EXCEL_PATH, "ValidLogin");
			String username = Lib.getCellValue(EXCEL_PATH, "ValidLogin", 1, 0);
			String password = Lib.getCellValue(EXCEL_PATH, "ValidLogin", 1, 1);
			//enter "admin" in username text box
			l.setUsername(username);
			//enter "manager" in password text box
			l.setPassword(password);
			//click on Login button
			l.clickLogin();
	}
}
