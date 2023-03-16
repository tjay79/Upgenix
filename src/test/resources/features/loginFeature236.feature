Feature: Default

	#Acceptance Criteria 1:
	#
	#The user should be able to login in with valid credentials
	@UPG10-235
	Scenario Outline: Verify that the user can log in to the app with valid credentials
		Given the user is on the login page
		    When the user enters valid <username>
		    And the user enters  valid "posmanager"
			And the user clicks on the log in button
		    Then the user should be on the inbox page
		
		    Examples: valid usernames that should be able to login
		      | username |
		      | 5        |
		      | 6        |
		      | 7        |
		      | 8        |
		      | 9        |
		      | 10       |
		      | 11       |
		      | 12       |
		      | 13       |
		      | 14       |
		      | 15       |
		      | 16       |
		      | 17       |
		      | 18       |
		      | 19       |
		      | 20       |
		      | 33       |
		      | 95       |
		      | 96       |
		      | 97       |
		      | 98       |
		      | 99       |
		      | 100      |
		      | 101      |
		      | 102      |
		      | 103      |
		      | 104      |
		      | 105      |