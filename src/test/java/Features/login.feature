Feature: Login
  Scenario: My login Scenario
    Given I open login page
    When I enter email "aaa@example.com"
    And I enter password "aaa"
    And I click login button
    Then I should be logged in
    And I wait 5 seconds