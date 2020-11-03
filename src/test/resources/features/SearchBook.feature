Feature: search book
  Background: login to libraryCT
    When user is on login page
    And user logs in as librarian

    @search_book
    Scenario: User is on the dashboard page
      When user clicks the Books module
      Then user searches the book by giving the author name

