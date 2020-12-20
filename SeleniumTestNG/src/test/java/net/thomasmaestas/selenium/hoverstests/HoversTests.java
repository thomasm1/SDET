package net.thomasmaestas.selenium.hoverstests;

import org.testng.Assert;
import org.testng.annotations.Test;

import net.thomasmaestas.selenium.base.TestUtilities;
import net.thomasmaestas.selenium.pages.HoversPage;

public class HoversTests extends TestUtilities {

	@Test
	public void user2ProfileTest() {
		log.info("Starting user2ProfileTest");

		// Open HoversPage
		HoversPage hoversPage = new HoversPage(driver, log);
		hoversPage.openPage();

		// Open User 2 profile
		hoversPage.openUserProfile(2);

		// Verify correct user profile opened
		Assert.assertTrue(hoversPage.getCurrentUrl().contains("/users/2"),
				"Url of opened page is not expected User 1 page url");
	}
}
