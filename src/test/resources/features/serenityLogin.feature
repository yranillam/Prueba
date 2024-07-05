Feature: Login on the website

  Scenario Outline: testing the login module
    Given the user is on the serenity demo page
    When attempts to log in
      | user  | pass     |
      | admin | serenity |
    Then will validate the text on screen <message>
    Examples:
      | message   |
      | Dashboard |