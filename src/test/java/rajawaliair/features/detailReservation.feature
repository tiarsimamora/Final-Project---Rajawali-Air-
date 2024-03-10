@detailReservation
Feature: View Detail Reservation

  @detailReservation
  Scenario: As an admin, I want to add airplane data
    Given user navigate to url "https://rajawali-air.vercel.app/login/admin"
    When user login using "admin@gmail.com"
    * admin click detail reservation
    Then admin can view detail reservation
    * user take screenshot "Admin successfully view detail reservation"
