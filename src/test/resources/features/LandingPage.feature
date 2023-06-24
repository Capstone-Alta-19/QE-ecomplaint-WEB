Feature: Landing Page Complaint

  @LandingPage @NormalPositive @DownloadApp
    Scenario: User can download App mobile
    Given user on the landing page
    Then user click button download now

#  @LandingPage @NormalPositive @ChangeLanguage
#    Scenario: User can change english language
#    Given user on the landing page
#    When user click button language
#    Then user click button English

  @Help @NormalPositive @ReadArticleHelp
    Scenario: user can read article help
    Given user on the landing page
    And user click button help
#    Then user click button read more article about help

  @Help @NormalPositive @HelpOnTheWhatsApp
    Scenario: user can click hlp on the WhatsApp button
    Given user on the landing page
    When user click button help
    Then user click button whatsApp to help