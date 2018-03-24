Feature: Login
  Scenario: My login Scenario
    Given I open login page
    When I enter email "aaa@example.com"
    And I enter password "aaa"
    And I click login button
    Then I should not be logged in
    And I wait 1 seconds


  Scenario: My login Scenario
    Given I open login page
    When I enter email "administrator@testarena.pl"
    And I enter password "sumXQQ72$L"
    And I click login button
    Then I should be logged in
    And I wait 1 seconds