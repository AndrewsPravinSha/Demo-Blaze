@addtoCart
Feature: Validation of Products adding to Cart

  Background: 
    Given launch the url
    When Adding a product to Cart
    Then checking whether the product is Added in cart
  
  @placingOrder
  Scenario: Placing the order
    When entering the details
    Then place the order in cart
    And print out the Generated id 
