$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/AddEmployee.feature");
formatter.feature({
  "line": 2,
  "name": "Add Employee",
  "description": "User want to Add employee",
  "id": "add-employee",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AddEmployee"
    },
    {
      "line": 1,
      "name": "@Dev"
    }
  ]
});
formatter.before({
  "duration": 39175483864,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Add Employee with valid data",
  "description": "",
  "id": "add-employee;add-employee-with-valid-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@PositiveCase"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User already login with \"Admin\" As username and \"admin123\" as passwword",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User open the add employee page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User input \"Nafi\" as first name, \"Naff\" as middle name and \"Hermawan\" as last name",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User upload photo \"frame.png\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User \"Nafi Naff Hermawan\" already created",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "AddEmployeeStep.addEmployeePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Nafi",
      "offset": 12
    },
    {
      "val": "Naff",
      "offset": 34
    },
    {
      "val": "Hermawan",
      "offset": 60
    }
  ],
  "location": "AddEmployeeStep.inputEmployeeName()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "frame.png",
      "offset": 19
    }
  ],
  "location": "AddEmployeeStep.inputPhoto()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Nafi Naff Hermawan",
      "offset": 6
    }
  ],
  "location": "AddEmployeeStep.employeeCreated()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 523891,
  "status": "passed"
});
formatter.uri("features/Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    },
    {
      "line": 1,
      "name": "@Dev"
    }
  ]
});
formatter.before({
  "duration": 14118239335,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User input invalid credential",
  "description": "",
  "id": "login;user-input-invalid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@NegativeLogin"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user open the web page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user input \"Admin\" as username and \"admin\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user see error message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.loginOrangeHRM()"
});
formatter.result({
  "duration": 1450371249,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 12
    },
    {
      "val": "admin",
      "offset": 36
    }
  ],
  "location": "LoginStep.inputInvalidCredential(String,String)"
});
formatter.result({
  "duration": 4256338474,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.errorMassage()"
});
formatter.result({
  "duration": 118921839,
  "status": "passed"
});
formatter.after({
  "duration": 78374,
  "status": "passed"
});
formatter.before({
  "duration": 18557799677,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "username and password match",
  "description": "",
  "id": "login;username-and-password-match",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@PositiveCase"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user open the web page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user input \"admin\" as username and \"admin123\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user see dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.loginOrangeHRM()"
});
formatter.result({
  "duration": 154725561,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 12
    },
    {
      "val": "admin123",
      "offset": 36
    }
  ],
  "location": "LoginStep.inputInvalidCredential(String,String)"
});
formatter.result({
  "duration": 10987581033,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.loginSucces()"
});
formatter.result({
  "duration": 143065139,
  "status": "passed"
});
formatter.after({
  "duration": 55048,
  "status": "passed"
});
});