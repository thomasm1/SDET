package com.revature.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WikiMain {

	public WebDriver driver;
	
	public WikiMain(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getEnglish() {
		return driver.findElement(By.cssSelector("div[lang='en']"));
	}
	
	public WebElement getFrench() {
		return driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[1]/div[6]"));
	}
	
	public WebElement getSearchbar() {
		return driver.findElement(By.id("searchInput"));
	}
}
