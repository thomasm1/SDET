package cucumber.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;

public class Login {
	WebDriver driver;
	
@Before
public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\w\\www\\git\\CucumberFramework\\CucumberFramework\\src\\test\\resources\\chromedriver.exe");
	this.driver = new ChromeDriver();
	this.driver.manage().window().maximize();
	this.driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
	this.driver.manage().timeouts().setScriptTimeout(60,TimeUnit.SECONDS); 
}

@After
public void tearDown() throws InterruptedException {
	Thread.sleep(2000);
	this.driver.manage().deleteAllCookies();
	this.driver.quit();
	this.driver = null;
}
	
@Given("^User navigates to stackoverflow website$")
public void user_navigates_to_stackoverflow_website() throws Throwable { 
   driver.get("https://stackoverflow.com/");
}

@And("^User clicks on login$")
public void user_clicks_on_login() throws Throwable { 
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[text()='Log in']")).click(); 
}

@And("^User enters username$")
public void user_enters_username() throws Throwable {
	   Thread.sleep(2000);
	   driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("thomasm1.maestas@gmail.com");
}

@And("^User enters a valid password$")
public void user_enters_a_valid_password() throws Throwable {
	   Thread.sleep(2000);
	   driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("Tarmchair2xx$");
  
}

@When("^User clicks on login button$")
public void user_clicks_on_login_button() throws Throwable {
	  Thread.sleep(2000);
	   driver.findElement(By.xpath(".//*[@id='submit-button']")).click(); 
    
}

@Then("^User should be taken to successful login page$")
public void user_should_be_taken_to_successful_login_page() throws Throwable {
	  Thread.sleep(2000);
	   WebElement askQuestionButton = driver.findElement(By.xpath("//a[contains(text(), 'Ask Question')]"));
	   Assert.assertEquals(true, askQuestionButton.isDisplayed());
}


}
