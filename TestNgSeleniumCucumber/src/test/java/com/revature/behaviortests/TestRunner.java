package com.revature.behaviortests;

import org.testng.annotations.AfterSuite;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		//feature is the outline for the test
		features = {"src/test/resources/WikiLang.feature", "src/test/resources/WikiSearch.feature"},
		
		//glue is where our actual code/step implementations are.
		glue = {"com.revature.behaviortests"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

	@AfterSuite
	public void teardown() {
		WikiLangStepImpl.driver.quit();
		WikiSearchStepImpl.driver.quit();
	}
}
