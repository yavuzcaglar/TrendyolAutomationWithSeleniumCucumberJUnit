Feature: Login Functionality

  @positiveLoginTest
  Scenario: Positive Login Test
    Given User is on the home page
    When User taps on the "Giriş Yap" button
    Then Verify that user is on the login page
    When User enters valid "fortestingprojects001@gmail.com" and "test12345*"
    When User taps on giris yap button
    Then Verify that the user is logged in

  @wip
  Scenario Outline: Negative Login Test
    Given User is on the home page
    When User taps on the "Giriş Yap" button
    Then Verify that user is on the login page
    When User enters valid "<email>" and "<password>"
    When User taps on giris yap button
    Then Verify that the user is not logged in and error message appears
    Examples:
      | email                           | password      |
      | wrongEmail                      | test12345*    |
      | wrongEmail                      | wrongPassword |
      | wrongEmail                      |               |
      | fortestingprojects001@gmail.com | wrongPassword |
      |                                 | wrongPassword |
      |                                 |               |
      | fortestingprojects001@gmail.com |               |
      |                                 | test12345*    |


