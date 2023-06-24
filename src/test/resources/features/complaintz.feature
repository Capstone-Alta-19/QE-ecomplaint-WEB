Feature: Complaint Admin

  @Login @NormalPositive @ValidLogin
    Scenario: user can success login
    Given user on the login page
    When user input valid username "admin"
    And user input valid password "admin123"
    Then user click login button

  @Login @NormalNegative @InvalidUsername
    Scenario: user cannot login with invalid username
    Given user on the login page
    When user input invalid username "invalidadmin"
    And user input valid password "admin123"
    Then user click login button

  @Login @NormalNegative @InvalidPassword
  Scenario: user cannot login with invalid password
    Given user on the login page
    When user input valid username "admin"
    And user input invalid password "invalidadmin123"
    Then user click login button
