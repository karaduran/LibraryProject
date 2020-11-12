Feature: Login

  Background: login to libraryCT
    Given user is on login page

  @login_librarian
  Scenario:login as a librarian
    When user logs in as librarian


  @login_scenario_outline
  Scenario Outline: Parametrized login as <role>
    When user logs in as a "<role>"
    Then user should see the Dashboard page

    Examples:
      | role      |
      | librarian |
      | student   |






