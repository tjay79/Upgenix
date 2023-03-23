Feature: Default

	#{color:#de350b}Acceptance Criteria 5:{color}
	#
	#Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.
	@UPG10-323
	Scenario: Verify that the Enter key of the keyboard is working correctly on the login page
		Given the user is on the login page
		When the user enters a valid username "salesmanager45@info.com"
		And the user enters a valid password "salesmanager"
		And the user hits the Enter key on the keyboard
		Then the user should be able to login