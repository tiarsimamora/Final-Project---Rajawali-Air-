@admin
Feature: Add Airport - Admin

  @AddAirport
  Scenario: As an admin, I want to add airport data
    Given user navigate to url "https://rajawali-air.vercel.app/login/admin"
    When user login using "admin@gmail.com"
    * admin adds airport data
    Then admin can view new airport data successfully added
    * user take screenshot "Admin successfully adds new airport data"

  Scenario: As an admin, I want to edit airport data
    Given user navigate to url "https://rajawali-air.vercel.app/login/admin"
    When user login using "admin@gmail.com"
    * admin do edit airport data
    Then admin can view new airport data successfully edited
    * user take screenshot "Admin successfully edit new airport data"

  Scenario: As an admin, I want to delete airport data
    Given user navigate to url "https://rajawali-air.vercel.app/login/admin"
    When user login using "admin@gmail.com"
    * admin delete airport data
    Then airport data will be deleted
    * user take screenshot "Admin successfully delete airport data"