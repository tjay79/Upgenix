Feature: Default

	#{color:#de350b}Acceptance Criteria 3: {color}
	#
	#The user must be logged out if the user closes the open tab (all tabs if there are multiple open tabs)
	@UPG10-409
	Scenario: User must be logged out if the user closes the open tab (all tabs if there are multiple open tabs)
		Given user is on the inbox page
		When the user closes the tab
		And opens a new page
		Then user should be logged out