Feature: Feature to test login login functionality

  Scenario: Check login is successfulyy with valid creds
    Given user is in login page
    When  user enters username and password
    And  clicks on login button
    Then user is logged in successfully