package net.thomasmaestas.selenium.alertstests;

//import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import net.thomasmaestas.selenium.base.TestUtilities;
import net.thomasmaestas.selenium.pages.JavaScriptAlertsPage;
import net.thomasmaestas.selenium.pages.WelcomePage;

public class AlertsTests extends TestUtilities {

	@Test
	public void jsAlertTest() {
		log.info("Starting jsAlertTest");
		SoftAssert softAssert = new SoftAssert();
		
		// open main page
		WelcomePage welcomePage = new WelcomePage(driver, log);
		welcomePage.openPage();

		// Click on JavaScript Alerts link
		JavaScriptAlertsPage alertsPage = welcomePage.clickJavaScriptAlertsLink();

		// Click JS Alert button
		alertsPage.openJSAlert();
		sleep(1000);
		
		// Get alert text
		String alertMessage = alertsPage.getAlertText();

		// Click OK button
		alertsPage.acceptAlert();

		// Get Results text
		String result = alertsPage.getResultText();
		sleep(1000);
		// Verifications
		// 1 - Alert text is expected
		softAssert.assertTrue(alertMessage.equals("I am a JS Alert"), 
//		Assert.assertTrue(alertMessage.equals("I am a JS Alert"),
				"Alert message is not expected. \nShould be 'I am a JS Alert', but it is '" + alertMessage + "'");

		// 2 - Result text is expected            	<!-- line 45 is inexplicable error - should be fine -->
		softAssert.assertTrue(result.equals("You successfuly clicked an alert"),
				"result is not expected. \nShould be 'You successfuly clicked an alert', but it is '" + result + "'");
		softAssert.assertAll();
	}

	@Test
	public void jsDismissTest() {
		log.info("Starting jsDismissTest");
		SoftAssert softAssert = new SoftAssert();

		// open main page
		WelcomePage welcomePage = new WelcomePage(driver, log);
		welcomePage.openPage();

		// Click on JavaScript Alerts link
		JavaScriptAlertsPage alertsPage = welcomePage.clickJavaScriptAlertsLink();

		// Click JS Confirm button
		alertsPage.openJSConfirm();
		sleep(1000);
		// Get alert text
		String alertMessage = alertsPage.getAlertText();

		// Click Cancel button
		alertsPage.dismissAlert();

		// Get Results text
		String result = alertsPage.getResultText();
		sleep(1000);
		// Verifications
		// 1 - Alert text is expected
		softAssert.assertTrue(alertMessage.equals("I am a JS Confirm"),
				"Alert message is not expected. \nShould be 'I am a JS Confirm', but it is '" + alertMessage + "'");

		// 2 - Result text is expected
		softAssert.assertTrue(result.equals("You clicked: Cancel"),
				"result is not expected. \nShould be 'You clicked: Cancel', but it is '" + result + "'");
		softAssert.assertAll();
	}

	@Test
	public void jsPromptTest() {
		log.info("Starting jsDismissTest");
		SoftAssert softAssert = new SoftAssert();

		// open main page
		WelcomePage welcomePage = new WelcomePage(driver, log);
		welcomePage.openPage();

		// Click on JavaScript Alerts link
		JavaScriptAlertsPage alertsPage = welcomePage.clickJavaScriptAlertsLink();

		// Click JS Prompt button
		alertsPage.openJSPrompt();
		sleep(1000);
		// Get alert text
		String alertMessage = alertsPage.getAlertText();

		// Type text into alert
		alertsPage.typeTextIntoAlert("Hello Alert, it's Dmitry here");
		sleep(1000);
		// Get Results text
		String result = alertsPage.getResultText();
		sleep(1000);
		// Verifications
		// 1 - Alert text is expected
		softAssert.assertTrue(alertMessage.equals("I am a JS prompt"),
				"Alert message is not expected. \nShould be 'I am a JS prompt', but it is '" + alertMessage + "'");

		// 2 - Result text is expected    
		softAssert.assertTrue(result.equals("You entered: Hello Alert, it's Dmitry here"),
				"result is not expected. \nShould be 'You entered: Hello Alert, its Dmitry here', but it is '" + result
						+ "'");
		softAssert.assertAll();
	}
}
