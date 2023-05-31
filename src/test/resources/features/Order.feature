@OrderAltaShopWeb
Feature: Check order
  @AltaShopWeb @OrderAltaShopWeb @Order @Positive
  Scenario: User can order with valid data
    Given user is on Alta Shop Web landing page
    When user click on the account icon
    And user input valid login email "jojo123@email.com"
    And user input valid login password "1234"
    And user click on the login button
    And user click on the buy button
    And user click on the cart icon
    And user click on the pay button
    Then user redirected to Alta Shop transaction page and see "Transactions" text

  @AltaShopWeb @OrderAltaShopWeb @Order @Positive
  Scenario: User can increase order with valid data
    Given user is on Alta Shop Web landing page
    When user click on the account icon
    And user input valid login email "1234"
    And user input valid login password "1234"
    And user click on the login button
    And user click on the buy button
    And user click on the cart icon
    And user click on the increase button
    Then user see "2" text in order page increase

  @AltaShopWeb @OrderAltaShopWeb @Order @Positive
  Scenario: User can decrease order with valid data
    Given user is on Alta Shop Web landing page
    When user click on the account icon
    And user input valid login email "jojo123@email.com"
    And user input valid login password "1234"
    And user click on the login button
    And user click on the buy button
    And user click on the cart icon
    And user click on the decrease button
    Then user see "Order is empty!" text in order page decrease

