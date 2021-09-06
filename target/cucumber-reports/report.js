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
    }
  ]
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
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});