package net.thomasmaestas.selenium.loginpagetests;

import java.util.Map;

import org.testng.Assert;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import net.thomasmaestas.selenium.base.TestUtilities;
import net.thomasmaestas.selenium.pages.LoginPage;
import net.thomasmaestas.selenium.pages.WelcomePage;
import net.thomasmaestas.selenium.base.CsvDataProviders;

public class NegativeLogInTestsDataProvider extends TestUtilities {

//	@Parameters({ "username", "password", "expectedMessage" })
	@Test(priority = 1, dataProvider="csvReader", dataProviderClass = CsvDataProviders.class)
//	public void negativeTest(String username, String password, String expectedErrorMessage) {
	public void negativeLogInTest(Map<String, String> testData) { 
		
		// incoming data
		String no = testData.get("no");
		String username = testData.get("username");
		String password = testData.get("password");
		String expectedErrorMessage = testData.get("expectedMessage");
		String description = testData.get("description");
		
		
		log.info("Starting negativeTest: " + no + " for " + description);

		// open main page
		WelcomePage welcomePage = new WelcomePage(driver, log);
		welcomePage.openPage();

		// Click on Form Authentication link
		LoginPage loginPage = welcomePage.clickFormAuthenticationLink();

		// execute negative login
		loginPage.negativeLogIn(username, password);

		// wait for error message
		loginPage.waitForErrorMessage();
		String message = loginPage.getErrorMessageText();

		// Verification
		Assert.assertTrue(message.contains(expectedErrorMessage), "Message doesn't contain expected text.");
	}
}
