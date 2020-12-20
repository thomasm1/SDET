package net.thomasmaestas.selenium.dropdowntests;

import org.testng.Assert;
import org.testng.annotations.Test;

import net.thomasmaestas.selenium.base.TestUtilities;
import net.thomasmaestas.selenium.pages.DropdownPage;
import net.thomasmaestas.selenium.pages.WelcomePage;

public class DropdownTests extends TestUtilities {
	
	@Test
	public void optionTwoTest() {
		log.info("Starting optionTwoTest");

		// open main page
		WelcomePage welcomePage = new WelcomePage(driver, log);
		welcomePage.openPage();

		// Click on Dropdown link
		DropdownPage dropdownPage = welcomePage.clickDropdownLink();

		// Select Option 2
		dropdownPage.selectOption(2);

		// Verify Option 2 is selected
		String selectedOption = dropdownPage.getSelectedOption();
		Assert.assertTrue(selectedOption.equals("Option 2"),
				"Option 2 is not selected. Instead selected - " + selectedOption);
	}
}
