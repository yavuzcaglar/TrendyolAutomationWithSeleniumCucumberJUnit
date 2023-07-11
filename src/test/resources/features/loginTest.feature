Feature: Login Functionality

  @wip
  Scenario: Positive Login Test
    Given User is on the home page
    When User taps on the giris yap button
    Then Verify that user is on the login page
    When User enters valid "email"
    When User enters valid "password"
    When User taps on giris yap button
    Then Verify that the user is logged in

