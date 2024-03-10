@register
Feature: Register

  @register
  Scenario: As a user, I should be able to registered data
    Given user navigate to url "https://rajawali-air.vercel.app/register"
    When user register using valid data
    Then user direct to OTP verify screen
    * user take screenshot "user-register-successfully"

  @register
  Scenario Outline: As a user, I should be able to registered data
    Given user navigate to url "https://rajawali-air.vercel.app/register"
    When user register using email1234gmail.com
    Then error exist with value "<error>"
    * user take screenshot "user-register-unsuccessfully-email"

    Examples:
      | error  |
      | Invalid Email |

