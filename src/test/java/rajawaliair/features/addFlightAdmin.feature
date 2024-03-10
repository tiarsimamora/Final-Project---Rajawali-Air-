@admin
Feature: Add Flight - Admin

  @AddFlight
  Scenario: As an admin, I want to add airplane data
    Given user navigate to url "https://rajawali-air.vercel.app/login/admin"
    When user login using "admin@gmail.com"
    * admin adds flight data
    Then admin can view new flight data successfully added
    * user take screenshot "Admin successfully adds new flight data"

#  @AddFlight
#  Scenario: As an admin, I want to edit flight data
#    Given user navigate to url "https://rajawali-air.vercel.app/login"
#    When user login using "admin@gmail.com"
#    * admin do edit flight data
#    Then admin can view new flight data successfully edited
#    * user take screenshot "Admin successfully edit new airplane data"


#  @AddFlight
#  Scenario: As an admin, I want to delete flight data
#    Given user navigate to url "https://rajawali-air.vercel.app/login"
#    When user login using "admin@gmail.com"
#    * admin delete flight data
#    Then flight data will be deleted
#    * user take screenshot "Admin successfully delete flight data"