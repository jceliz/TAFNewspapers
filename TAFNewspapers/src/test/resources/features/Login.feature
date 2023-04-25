@Login
Feature: Newspaper reader login

  Scenario Outline: Login
    Given user is on newspapers.com page
    And   user clicks Sign-in button
    Then  Sign in to Newspapers.com pop-up is displayed
    When  user inputs email address
    And   user inputs password
    And   user clicks Sign in with Newspapers.com button
    Then  username - "<username>" is displayed as sign of successful login
    And   user closes the browser

    Examples:
      | username    |
      | lourdestest |

