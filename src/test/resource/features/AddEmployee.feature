@AddEmployee 
Feature: Add Employee
  User want to Add employee

  @PositiveCase
  Scenario: Add Employee with valid data
    Given User already login with "Admin" As username and "admin123" as passwword
    When User open the add employee page
    And User input "Nafi" as first name, "Naff" as middle name and "Hermawan" as last name
    And User upload photo "frame.png"
    Then User "Nafi Naff Hermawan" already created