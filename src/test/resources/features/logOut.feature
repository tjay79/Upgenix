Feature: Default

	#{color:#de350b}Acceptance Criteria 1:{color}
	#
	#User can log out and ends up in login page.
	@UPG10-386
	Scenario: User can log out and ends up in login page.
		Given user is on the inbox page
		When the user logs out
		Then user should be logged out and back on the login page