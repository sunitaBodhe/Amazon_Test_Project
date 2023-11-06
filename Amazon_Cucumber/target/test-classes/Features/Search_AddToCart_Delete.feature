Feature: Search the product and then add to cart and delete

  Scenario: To search the product and add the product to cart then delete thet product
    Given Login page should  open in default browser
    And User should  already login
    When Search product
    And click on the product
    And click on add to cart button
    And go to the cart
    And delete the product
    Then product deleted successfuly
    And Home page
