@ProductAltaShopWeb
Feature: Check product
  @AltaShopWeb @ProductAltaShopWeb @Product @Positive
  Scenario: User can see product detail with valid data
    Given user is on Alta Shop Web landing page
    When user click on the account icon
    And user input valid login email "jojo123@email.com"
    And user input valid login password "1234"
    And user click on the login button
    And user click on the detail button
    Then user redirected to Alta Shop product page and see "Rp 299" text