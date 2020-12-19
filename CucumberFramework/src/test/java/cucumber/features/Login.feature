Feature: Login to account
	Existing StackOverflow user login with creds
	
Scenario: Login to account with correct details
	Given User navigates to stackoverflow website
	And User clicks on login
	And User enters username
	And User enters a valid password
	When User clicks on login button
	Then User should be taken to successful login page  