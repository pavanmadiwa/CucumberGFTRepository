Feature: login feature

  Scenario: user enters username and password
    Given the login page opened
    When user enters Lalitha as username
    And user enters password123 as password
    Then user will be able to access homepage of testme app
