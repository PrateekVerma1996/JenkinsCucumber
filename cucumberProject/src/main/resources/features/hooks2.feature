
Feature: login to a website
  Scenario Outline: user login to the website
    Given user navigates to the webpage after entering URL
    Given  "<Username>" and "<password>" entered by the user
    When login button gets clicked by the user
    Then login page gets opened up
    And logout button gets clicked
    Examples:
      | Username | password    |
      | student  | Password123 |
  Scenario Outline: invalid credentials
    Given user navigates to the webpage after entering URL
    And invalid credentials "<Username>" and "<password>"
    When  login button is been clicked by a user
    Then error occured regarding the credentials
    Examples:
      | Username | password    |
      | student1 | Password123 |

#  Scenario: Signing up to the page
#    When User goes to sign up page
#    And enters the following details
#    |prat|tornado|italy ke pass|godfather|wayne manor|near yamuna river|gotham|batman@exam.co|1234567890|query|
#    And


