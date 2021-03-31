  Feature: Amazon Search

    Scenario: Verify Search Results
      Given I launch Chrome browser
      When I Open Amazon Home Page
      And Search for mobile
      Then Search results for mobile should be displayed