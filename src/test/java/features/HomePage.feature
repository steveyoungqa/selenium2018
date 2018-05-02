@chrome

  Feature: BBC HomePage for Framework example

    Scenario: Framework example
      Given I am using the "Chrome" browser
      And I am on the "https://www.bbc.co.uk/" website

      Then I select the Sport section using a CSS Path
      And I select the Football section using an Xpath with Span text
      Then I select the "Tables" section using an Xpath with Text Contains
      And I search for the Team "Crystal Palace" using an ID locator

      Then I search for "World Cup" using Link Text locator
      And I search for "All Scores &" using Partial Link Text locator




