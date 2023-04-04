

Feature: Register Functionality

  Scenario: Create an account valid user information

    Given Navigate to parabank
    When  Click register link
    When  Enter valid information
    When  Click register button
    Then  verify  success message
