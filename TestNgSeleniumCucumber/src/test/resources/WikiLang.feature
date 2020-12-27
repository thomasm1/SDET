#This is a comment
Feature: Wikipedia supports many languages

Scenario: English Wikipedia works

	Given I am on the Wikipedia Home Page
	When I click on English
	Then I should be on the English Wiki
	
Scenario: French Wikipedia works
	
	Given I am on the Wikipedia Home Page
	When I click on French
	Then I should be on the French Wiki