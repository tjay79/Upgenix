Feature: Default

	#{color:#de350b}Acceptance Criteria 2:{color}
	#
	#{color:#172b4d}"Wrong login/password" message should be displayed for invalid credentials{color}
	@UPG10-265
	Scenario Outline: Verify "Wrong login/password" message is displayed for invalid credentials (valid username - invalid password)
		Given user is on the login page
		When user enters the <username>
		And user enters the wrong "password"
		And user clicks the log in button
		Then user should see the "Wrong login/password" message
		
		Examples:
		|username|
		|5|
		|6|
		|7|
		|8|
		|9|
		|10|
		|105|
		|66|
		|88|
		|91|