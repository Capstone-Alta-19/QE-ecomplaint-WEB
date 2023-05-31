@LoginAltaShopWeb
Feature: Check login
  @AltaShopWeb @LoginAltaShopWeb @Login @Positive
  Scenario: User can login with valid data
    Given user is on Alta Shop Web landing page
    When user click on the account icon
    And user input valid login email "jojo123@email.com"
    And user input valid login password "1234"
    And user click on the login button
    Then user redirected to Alta Shop main page and see "AltaShop" text

  @AltaShopWeb @LoginAltaShopWeb @Login @Negative
  Scenario: User can login with invalid data wrong email
    Given user is on Alta Shop Web landing page
    When user click on the account icon
    And user input invalid login email "salah12312edq"
    And user input valid login password "1234"
    And user click on the login button
    Then user see login error alert box wrong "record not found"

  @AltaShopWeb @LoginAltaShopWeb @Login @Negative
  Scenario: User can login with invalid data wrong password
    Given user is on Alta Shop Web landing page
    When user click on the account icon
    And user input valid login email "jojo123@email.com"
    And user input invalid login password "123123"
    And user click on the login button
    Then user see login error alert box wrong "email or password is invalid"

  @AltaShopWeb @LoginAltaShopWeb @Login @Negative
  Scenario: User can login with invalid data empty data
    Given user is on Alta Shop Web landing page
    When user click on the account icon
    And user input invalid login email ""
    And user input valid login password "1234"
    And user click on the login button
    Then user see login error alert box email "email is required"

  @AltaShopWeb @LoginAltaShopWeb @Login @Negative
  Scenario: User can login with invalid data empty data
    Given user is on Alta Shop Web landing page
    When user click on the account icon
    And user input invalid login email "jojo123@email.com"
    And user input invalid login password ""
    And user click on the login button
    Then user see login error alert box password "password is required"







