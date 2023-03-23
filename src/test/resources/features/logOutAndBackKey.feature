Feature: Default

	#{color:#de350b}Acceptance Criteria 2: {color}
	#
	#The user can not go to the home page again by clicking the step back button after successfully logged out.
	@UPG10-393
	Scenario: User should not go to the home page again by clicking the step back button after successfully logged out.
		Given user is on the inbox page
		When the user logs out
		Then user should be not be able to go back to the inbox by pressing the Back key