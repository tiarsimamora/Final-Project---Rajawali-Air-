@login
Feature: Login

  @login
  Scenario: As a user, I should be able to log in using correct registered data
    Given user navigate to url "https://rajawali-air.vercel.app/login/admin"
    When user login using "admin@gmail.com"
    Then user direct to dashboard screen
    * user take screenshot "user-login-successfully"

  @login
  Scenario Outline: As a user, I should be able to log in using correct registered data
    Given user navigate to url "https://rajawali-air.vercel.app/login/admin"
    When user login using "admin1@gmail.com"
    Then error alert exist with value "<snackbar_error>"
    * user take screenshot "user-login-unsuccessfully-email"

    Examples:
      | snackbar_error |
      | Email not found |


  @login
  Scenario Outline: As a user, I should be able to log in using correct registered data
    Given user navigate to url "https://rajawali-air.vercel.app/login/admin"
    When user login using "admin.qa@gmail.com"
    Then password error alert exist with value "<snackbar_error2>"
    * user take screenshot "user-login-unsuccessfully-password"

    Examples:
      | snackbar_error2 |
      | Wrong Password  |

