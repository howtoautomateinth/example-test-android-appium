Feature: Welcome Message Displaying.

  Scenario: Welcome message have to display when I open demo application
    When I launch demo app
    And The App opened
    Then I see a welcome message "Hello World!"