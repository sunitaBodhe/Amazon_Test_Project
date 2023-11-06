
Feature: Change language

 
  Scenario: To change language
    Given page should  in open in browser
    And user should be loggin and internet connectivity
    When Click on language change field
    And Click on language
    And Click on save changes button
    Then Language change successfully
    And Homepage open

  
