Feature: Default

	#{color:#de350b}Acceptance Criteria 3:{color}
	#
	#User should see the "Please fill out this field" message if the username or password field is empty.
	@UPG10-284
	Scenario: User should see the "Please fill out this field" message if the username or password field is empty
		Scenario Outlook: the user should see the please fill out this field message when the username field is empty
		Given the user is on the login page
		When the user enters a valid password
		And the user doesn't enter a username
		Then the user should see the please fill out this field message under the email field