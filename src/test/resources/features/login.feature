Feature: As a user i should be able to login with valid credentials

  @login
  Scenario: user should be able to login with valid username and password
    Given user is on the landing page
    When user puts "username"
    And user insert "password"
    Then user should be able to login