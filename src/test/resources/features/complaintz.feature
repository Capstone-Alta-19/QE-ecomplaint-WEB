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

  @News @NormalPositive @DetailsNews
    Scenario: user can view details news
    Given user login on the website Complaint with valid username "admin" and valid password "admin123"
    When user click button news
    Then user click view details button on news

  @News @NormalPositive @AddNews
    Scenario: user can add news
    Given user login on the website Complaint with valid username "admin" and valid password "admin123"
    When user click button news
    And user click button add news
    And user input title news "Testing QE"
    And user choose button mahasiswa
    And user input details news "About Complaint"
    And user add picture
    Then user click button send news

  @Dashboard @NormalPositive @ChangeStatus
    Scenario: user can change status complaint
    Given user login on the website Complaint with valid username "admin" and valid password "admin123"
    When user click button view edit
    And user click button edit
    And user click button detail status
    And user click button resolved
    Then user click button save

  @Dashboard @NormalPositive @DeleteStatus
    Scenario: user can delete status complaint
    Given user login on the website Complaint with valid username "admin" and valid password "admin123"
    When user click button view edit
    And user click button edit
    Then user click button delete

  @Logout @NormalPositive @Logout
    Scenario: user can logout from website
    Given user login on the website Complaint with valid username "admin" and valid password "admin123"
    And user click button logout

