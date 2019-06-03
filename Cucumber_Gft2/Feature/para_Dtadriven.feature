Feature: Login Action test with data driven approach

  Scenario Outline: Successful Login with Credentials
    Given user is opening the application
    When user clicks on login apge
    And user enters "<username>" and "<password>"
    Then Message displayed as login succesfully

    Examples: 
      | username | password    |
      | lalitha  | password123 |
      | admin    | password456 |
