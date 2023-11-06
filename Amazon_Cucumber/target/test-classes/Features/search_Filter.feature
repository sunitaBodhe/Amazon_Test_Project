Feature: Search Product and add filter

  Scenario: To serach product and add filters
    Given Login page should open in default browser
    And user should be login
    When search product
    And add filters on the product
    Then filter product successfully
    And  Open Home page
