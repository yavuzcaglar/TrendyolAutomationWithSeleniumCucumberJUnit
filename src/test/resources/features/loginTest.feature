Feature: Login Functionality

  @wip
  Scenario: Positive Login Test
    Given User is on the home page
    When User taps on the "Giriş Yap" button
    Then Verify that user is on the login page
    When User enters valid "email" and "password"
    When User taps on giris yap button
    Then Verify that the user is logged in

