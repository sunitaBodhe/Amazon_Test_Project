Feature: To check login functionality

  Scenario: To check user is abel to login with valid credentials
    Given Login page should be open in default browser
    And internet connectivity should be available
    When Click on username field
    And enter valid username
    And Click on continue button
    And Click on password field
    And enter valid password
    Then Click on sign in button
    And login successfully
    And open home page


  