@Login
Feature: Login

  @NegativeLogin
  Scenario: User input invalid credential
    Given user open the web page
   	When user input "Admin" as username and "admin" as password
    Then user see error message