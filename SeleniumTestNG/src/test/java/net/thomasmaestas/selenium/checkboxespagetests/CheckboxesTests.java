package net.thomasmaestas.selenium.checkboxespagetests;

import org.testng.Assert;
import org.testng.annotations.Test;

import net.thomasmaestas.selenium.base.TestUtilities;
import net.thomasmaestas.selenium.pages.CheckboxesPage;
import net.thomasmaestas.selenium.pages.WelcomePage;

public class CheckboxesTests extends TestUtilities {

	@Test
	public void selectingTwoCheckboxesTest() {
		log.info("Starting selectingTwoCheckboxesTest");

		// open main page
		WelcomePage welcomePage = new WelcomePage(driver, log);
		welcomePage.openPage();

		// Click on Checkboxes link
		CheckboxesPage checkboxesPage = welcomePage.clickCheckboxesLink();

		// Select All Checkboxes
		checkboxesPage.selectAllCheckboxes();

		// Verify all checkboxes are checked
		Assert.assertTrue(checkboxesPage.areAllCheckboxesChecked(), "Not all checkboxes are checked");

	}
}
