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

  @Laporan @NormalPositive @ViewDetails
    Scenario: user can view details report
    Given user login on the website Complaint with valid username "admin" and valid password "admin123"
    When user click button report
    Then user click button view details

#  @Laporan @NormalPositive @ValidFeedback
#    Scenario: user can give feedback from a report
#    Given user login on the website Complaint with valid username "admin" and valid password "admin123"
#    When user click button report
#    And User click button view details
#    And user input feedback "sudah terjawab"
#    Then user click send button
#
#  @Laporan @NormalNegative @InvalidFeedback
#    Scenario: user cannot give feedback with blank on field
#    Given user login on the website Complaint with valid username "admin" and valid password "admin123"
#    When user click button report
#    And User click button view details
#    And user input feedback ""
#    Then user click send button

  @Berita @NormalPositive @News
    Scenario: user can view details news
    Given user login on the website Complaint with valid username "admin" and valid password "admin123"
    Given user click button news
    Then user click view details button on news