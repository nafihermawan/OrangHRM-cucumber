@Login @Dev
Feature: Login

  @NegativeLogin
  Scenario: User input invalid credential
    Given user open the web page
   	When user input "Admin" as username and "admin" as password
    Then user see error message
    
  @PositiveLogin
	Scenario: username and password match
 		Given user open the web page
 		When user input "admin" as username and "admin123" as password
 		Then user see dashboard page