Feature: Swag Lab Online shopping automation 

  Scenario: Place order Successfully
  
    Given user is on login page
    When user enters username and password
    And user click on login button
    Given user click on Add to cart for products
    And user clicks on cart button
    Then user can view the products in cart
   
	   Given user clicks on checkout button
    And user enters firstname, lastname and zip code
    And user clicks on continue and finish button
    Then user can see the message Thank you for your order
   