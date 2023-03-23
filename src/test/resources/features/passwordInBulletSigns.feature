Feature: Default

	#{color:#de350b}Acceptance Criteria 4:{color}
	#
	#User should see the password in bullet signs by default while typing (like ****)
	@UPG10-321

		Scenario: User should see the password in bullet signs by default while typing
		Given user is on the login page
		When user enters the username "salesmanager23@info.com"
		And user enters the password "salesmanager"
		Then user should see the password in bullet signs