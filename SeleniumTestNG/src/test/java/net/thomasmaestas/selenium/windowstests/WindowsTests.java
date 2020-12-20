package net.thomasmaestas.selenium.windowstests;

import org.testng.Assert;
import org.testng.annotations.Test;

import net.thomasmaestas.selenium.base.TestUtilities;
import net.thomasmaestas.selenium.pages.NewWindowPage;
import net.thomasmaestas.selenium.pages.WelcomePage;
import net.thomasmaestas.selenium.pages.WindowsPage;

public class WindowsTests extends TestUtilities {

	@Test
	public void newWindowTest() {
		log.info("Starting newWindowTest");

		// open main page
		WelcomePage welcomePage = new WelcomePage(driver, log);
		welcomePage.openPage();

		// Click on MultipleWindows link
		WindowsPage windowsPage = welcomePage.clickMultipleWindowsLink();

		// Click 'Click Here' link to open new window
		windowsPage.openNewWindow();
		sleep(1000);
		
		// Find and switch to new window page
		NewWindowPage newWindowPage = windowsPage.switchToNewWindowPage();

		String pageSource = newWindowPage.getCurrentPageSource();

		// Verification that new page contains expected text in source
		Assert.assertTrue(pageSource.contains("New Window"), "New page source doesn't contain expected text");
	}
}
