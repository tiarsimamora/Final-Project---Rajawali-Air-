@order
Feature: Order

  @order
  Scenario: As a user, I should be able to order
    Given user navigate to url "https://rajawali-air.vercel.app"
    When user search ticket
    And user choose ticket
    And user add-on baggage, meals and insurance
    Then user is on select ticket type page
    * user take screenshot "user-order-successfully"
