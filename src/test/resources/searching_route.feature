Feature: Searching route
  Scenario: User should find offers of route
#    Given User opens page "https://www.blablacar.pl/login"
    Given User logs in via email and inputs email="" and password=""
    And User inputs city from="Warszawa" and to="Sopot"
    And User selects date and number of passengers
    And User clicks Search button
    And List of offers is displayed
    When User reads and saves all offers
    Then All offers are saved



