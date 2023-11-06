
Feature: Multiple Search

 
  Scenario: To Search Multiple product
    Given Login page should be open in default browser
    And User should be already login
    When search first product
    And enter submit button
    And Search second product
    And enter  button
    And Search third product
    And enter submit 
    Then Product Search successfully
    And Home page open

  
