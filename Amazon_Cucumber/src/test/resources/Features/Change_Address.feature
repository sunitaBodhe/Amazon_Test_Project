Feature: Change the Address from setting

  Scenario: To change the address
    Given page should be in open in browser
    And user should be log in and internet connectivity
    When Click on account and list
    And Click on your address
    And Click on add address
    And Add information
    And Click on add address button
    And Again click on add address button
    Then Address successfully change
    And home page open
