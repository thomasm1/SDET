Feature: Searching of Wikipedia

	Background: 
		Given The user is on the Wikipedia Home Page
	
	Scenario Outline: User tries to search for different US States
		Given The user types in "<state>"
		When The user presses Enter
		Then The title of the article should be "<title>"
		
	Examples:
		|	state		|		title				|
		| West Virginia | West Virginia - Wikipedia |
		| Louisiana		| Louisiana - Wikipedia		|
		
		