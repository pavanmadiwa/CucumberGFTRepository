Feature: Login Action test

  Scenario: Successful Login with Credentials
    Given user login page is opened
    When user enters "lalitha" as a username and "password123" as a password
    When user clicks on login on button
    Then user finds a testme app homepage
