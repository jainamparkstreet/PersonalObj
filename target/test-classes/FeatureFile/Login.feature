Feature: Login with External User

	Scenario: Validate the external login
	Given User is on the login page "https://stgappnavigator.parkstreet.com/login"
	When user enters userid and password
		 | bjones | Park2003Street |
	Then user should be on the dashboard page