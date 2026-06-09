Feature: Portfolio Management

  Scenario: Open portfolio page
    Given admin is ready to manage portfolio
    When admin opens the portfolio page
    Then portfolio page should be displayed

  Scenario: Open add portfolio modal
    Given admin is ready to manage portfolio
    When admin opens the add portfolio modal
    Then add portfolio modal should be displayed

  Scenario: Create portfolio with valid data
    Given admin is ready to manage portfolio
    When admin creates a portfolio with valid data
    Then created portfolio should be displayed

  Scenario: Edit portfolio with valid data
    Given admin is ready to manage portfolio
    When admin edits portfolio with valid data
    Then updated portfolio should be displayed

  Scenario: Filter portfolio by category
    Given admin is ready to manage portfolio
    When admin filters portfolio by category
    Then portfolio data should be filtered

  Scenario: Delete portfolio data
    Given admin is ready to manage portfolio
    When admin deletes portfolio data
    Then portfolio page should still be displayed