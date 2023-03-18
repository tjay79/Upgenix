Feature: Default

	#{color:#de350b}Acceptance Criteria 3:{color}
	#
	#User should see the "Please fill out this field" message if the username or password field is empty.
  @UPG10-282
  Scenario Outline: User should see the "Please fill out this field" message if the username or password field is empty

    Given the user is on the login page
    When the user enters a valid <username>
    And doesn't enter a password
    Then the user should see the please fill out this field message

    Examples:
      | username |
      | 25       |
      | 33       |
      | 49       |
      | 67       |
      | 80       |