Feature: search book

  Background: login to libraryCT
    When user is on login page
    And user logs in as librarian

  @search_book
  Scenario: User is on the dashboard page
    When user clicks the Books module
    Then user searches the book by giving the author name


  @parametrized_search_book
  Scenario Outline: User searches  book by <author name>
    When user clicks the Books module
    Then user searches the book by giving the "<author name>"
    Examples:
      | author name       |
      | George Orwell     |
      | Ahmet Altan       |
      | Fyodor Dostoevsky |
      | Tolstoy           |

