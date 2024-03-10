@admin
Feature: Add Airport - Admin

  @AddAirplane
  Scenario: As an admin, I want to add airplane data
    Given user navigate to url "https://rajawali-air.vercel.app/login/admin"
    When user login using "admin@gmail.com"
    * admin adds airplane data
    Then admin can view new airplane data successfully added
    * user take screenshot "Admin successfully adds new airplane data"

  @AddAirplane
  Scenario: As an admin, I want to edit airplane data
    Given user navigate to url "https://rajawali-air.vercel.app/login/admin"
    When user login using "admin@gmail.com"
    * admin do edit airplane data
    Then admin can view new airplane data successfully edited
    * user take screenshot "Admin successfully edit new airplane data"

  Scenario: As an admin, I want to delete airplane data
    Given user navigate to url "https://rajawali-air.vercel.app/login/admin"
    When user login using "admin@gmail.com"
    * admin delete airplane data
    Then airplane data will be deleted
    * user take screenshot "Admin successfully delete airplane data"