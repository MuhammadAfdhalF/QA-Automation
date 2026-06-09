Feature: Admin Login

  Scenario: Login as admin with valid credentials
    Given admin opens the application
    When admin logs in with valid credentials
    Then admin should see the dashboard page

  Scenario: Login with empty email
    Given admin opens the application
    When admin logs in with empty email
    Then admin should stay on the login form

  Scenario: Login with empty password
    Given admin opens the application
    When admin logs in with empty password
    Then admin should stay on the login form

  Scenario: Login with invalid password
    Given admin opens the application
    When admin logs in with invalid password
    Then admin should not be redirected to dashboard