
Feature: Login
  Background: login to libraryCT
    Given user is on login page
  @login_librarian
  Scenario:login as a librarian
    When user logs in as librarian

  @login_student
    Scenario: login as a student
      When user logs in as a "student"


