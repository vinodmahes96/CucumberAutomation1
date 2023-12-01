@SmokeScenario
Feature: feature to test login functionality

  @SmokeTest
  Scenario: check login is successful with valid credentials
    Given user is on the login page
    When user enters username and password
    Then clicks on login button
    And user is navigated to the home page


