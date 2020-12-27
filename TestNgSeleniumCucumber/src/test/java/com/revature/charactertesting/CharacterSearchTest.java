package com.revature.charactertesting;

import java.io.File;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.revature.pages.WikiMain;

public class CharacterSearchTest {

	public static ChromeDriver driver;
	public static WikiMain wikimain;
	
	@BeforeSuite
	public void setUp() {
		File file = new File("src/test/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		driver = new ChromeDriver();
		wikimain = new WikiMain(driver);
	}
	
	@BeforeMethod
	public void before() {
		driver.get("https://www.wikipedia.org/");
	}
	
	@Test(dataProvider="characters")
	public void characterExists(String name, String expected) {
		
		wikimain.getSearchbar().sendKeys(name + Keys.ENTER);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(driver.getTitle(), expected);
		
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
	
	@DataProvider(name="characters")
	public static Object[][] character() {
		
		return new Object[][] {{"Luigi", "Luigi - Wikipedia"},{"Wario", "Wario - Wikipedia"},{"Ganondorf", "Ganon - Wikipedia"}};
	}
	
}
