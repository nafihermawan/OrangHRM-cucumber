$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Login.feature");
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
  "duration": 19588504443,
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
  "duration": 845814658,
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
  "location": "LoginStep.inputCredential(String,String)"
});
formatter.result({
  "duration": 2930444267,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.errorMassage()"
});
formatter.result({
  "duration": 124821326,
  "status": "passed"
});
formatter.after({
  "duration": 416127,
  "status": "passed"
});
formatter.before({
  "duration": 15377955341,
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
      "name": "@PositiveLogin"
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
  "duration": 131471429,
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
  "location": "LoginStep.inputCredential(String,String)"
});
formatter.result({
  "duration": 7260468488,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.loginSucces()"
});
formatter.result({
  "duration": 164992984,
  "status": "passed"
});
formatter.after({
  "duration": 73242,
  "status": "passed"
});
});