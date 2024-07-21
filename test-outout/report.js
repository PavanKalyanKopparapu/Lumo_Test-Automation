$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("NewAccountCreateFeature.feature");
formatter.feature({
  "line": 2,
  "name": "Signup",
  "description": "",
  "id": "signup",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "verify Signup flow",
  "description": "",
  "id": "signup;verify-signup-flow",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "When user is on signup page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the firstName \"\u003cFirstName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enter the lastName \"\u003cLastName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Enter the Email \"\u003cEmail\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Enter the password \"\u003cPassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Enter the confirm password \"\u003cconfirmPassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Click on create account button.",
  "keyword": "And "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "signup;verify-signup-flow;",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "Email",
        "Password",
        "confirmPassword"
      ],
      "line": 15,
      "id": "signup;verify-signup-flow;;1"
    },
    {
      "cells": [
        "pavan",
        "kumar",
        "pavan@mailnesia.com",
        "Pavan@123$",
        "Pavan@123$"
      ],
      "line": 16,
      "id": "signup;verify-signup-flow;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "verify Signup flow",
  "description": "",
  "id": "signup;verify-signup-flow;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "When user is on signup page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the firstName \"pavan\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enter the lastName \"kumar\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Enter the Email \"pavan@mailnesia.com\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Enter the password \"Pavan@123$\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Enter the confirm password \"Pavan@123$\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Click on create account button.",
  "keyword": "And "
});
formatter.match({
  "location": "SignUp_Stepdefenition.when_user_is_on_signup_page()"
});
formatter.result({
  "duration": 7991859900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pavan",
      "offset": 21
    }
  ],
  "location": "SignUp_Stepdefenition.enter_the_firstName(String)"
});
formatter.result({
  "duration": 4153466700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kumar",
      "offset": 20
    }
  ],
  "location": "SignUp_Stepdefenition.enter_the_lastName(String)"
});
formatter.result({
  "duration": 119275400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pavan@mailnesia.com",
      "offset": 17
    }
  ],
  "location": "SignUp_Stepdefenition.enter_the_Email(String)"
});
formatter.result({
  "duration": 181570500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pavan@123$",
      "offset": 20
    }
  ],
  "location": "SignUp_Stepdefenition.enter_the_password(String)"
});
formatter.result({
  "duration": 169931900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pavan@123$",
      "offset": 28
    }
  ],
  "location": "SignUp_Stepdefenition.enter_the_confirm_password(String)"
});
formatter.result({
  "duration": 4149913200,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Stepdefenition.click_on_create_account_button()"
});
formatter.result({
  "duration": 5649030400,
  "status": "passed"
});
formatter.uri("SignInFeature.feature");
formatter.feature({
  "line": 2,
  "name": "Login to the appilication",
  "description": "",
  "id": "login-to-the-appilication",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login To the appilication with valid credentials",
  "description": "",
  "id": "login-to-the-appilication;login-to-the-appilication-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "when click on the Login button",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter the Email address",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Enter the Passoword",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click on sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Stepdefenition.when_click_on_the_Login_button()"
});
formatter.result({
  "duration": 6210251700,
  "status": "passed"
});
formatter.match({
  "location": "Login_Stepdefenition.enter_the_Email_address()"
});
formatter.result({
  "duration": 172433400,
  "status": "passed"
});
formatter.match({
  "location": "Login_Stepdefenition.enter_the_Passoword()"
});
formatter.result({
  "duration": 111091900,
  "status": "passed"
});
formatter.match({
  "location": "Login_Stepdefenition.click_on_sign_in_button()"
});
formatter.result({
  "duration": 2003194200,
  "status": "passed"
});
});