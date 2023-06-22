Feature: Complaint

  @HomePage @NormalPositive @DownloadApp
    Scenario: User can download App mobile
    Given user login on the complaint with email "" and password ""
    Then user click button download now

  @HomePage @NormalPositive @ChangeLanguage
    Scenario: User can change english language
    Given user login on the complaint with email "" and password ""
    When user click button language
    Then user click button English

  @Help @NormalPositive @ReadArticleHelp
    Scenario: user can read article help
    Given user login on the complaint with email "" and password ""
    When user click button help on the homepage
    Then user click button read more article about help

  @Help @NormalPositive @HelpOnTheWhatsApp
    Scenario: user can click hlp on the WhatsApp button
    Given user login on the complaint with email "" and password ""
    When user click button help on the homepage
    Then user click button whatsApp to help