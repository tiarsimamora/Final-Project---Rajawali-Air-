@search
Feature: Search

  @search
  Scenario: Searching ticket
    Given user navigate to url "https://rajawali-air.vercel.app"
    When user selects source airport
    And user selects destination airport
    And user select departure date
    And user select passenger
    And user click on search button
    Then user is on ticket page
    * user take screenshot "user-search-successfully"
