@RegisterAltaShopWeb
Feature: Check register
  @AltaShopWeb @RegisterAltaShopWeb @Register @Positive
  Scenario: User can register with valid data
    Given user is on Alta Shop Web landing page
    When user click on the account icon
    And user click on the register button
    And user input valid register full name "jojo"
    And user input valid register email "jojo12121233@email.com"
    And user input valid register password "1234"
    And user click on the submit button
    Then user redirected to Alta Shop login page and see "Login" text

  @AltaShopWeb @RegisterAltaShopWeb @Register @Negative
  Scenario: User can register with invalid empty full name
    Given user is on Alta Shop Web landing page
    When user click on the account icon
    And user click on the register button
    And user input invalid register full name ""
    And user input valid register email "jojo123@email.com"
    And user input valid register password "1234"
    And user click on the submit button
    Then user see register error alert box and see "Register" text

  @AltaShopWeb @RegisterAltaShopWeb @Register @Negative
  Scenario: User can register with invalid empty email
    Given user is on Alta Shop Web landing page
    When user click on the account icon
    And user click on the register button
    And user input valid register full name "jojo"
    And user input invalid register email ""
    And user input valid register password "1234"
    And user click on the submit button
    Then user see register error alert box and see "Register" text

  @AltaShopWeb @RegisterAltaShopWeb @Register @Negative
  Scenario: User can register with invalid empty password
    Given user is on Alta Shop Web landing page
    When user click on the account icon
    And user click on the register button
    And user input valid register full name "jojo"
    And user input valid register email "jojo123@email.com"
    And user input invalid register password ""
    And user click on the submit button
    Then user see register error alert box and see "Register" text



