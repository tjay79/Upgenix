Feature: Default

	#{color:#de350b}Acceptance Criteria 2:{color}
	#
	#{color:#172b4d}User should see the "Wrong login/password" message when invalid username and valid password are entered.{color}
	@UPG10-276
	Scenario Outline: User should see the"Wong login/password" message when invalid credentials are entered (invalid username - valid password)
		Given user is on the login page
		When user enters an invalid <username>
		And a valid password "posmanager"
		And user clicks the login button
		Then user should see the Wrong login/password message
		
		Examples:
		|username|
		|2|
		|3|
		|4|
		|200|
		|201|
		|156|