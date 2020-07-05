$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/scenarioout.feature");
formatter.feature({
  "name": "To test functionality of facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To test login functionality of facebook",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user launches the url \"https://www.facebook.com\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user inputs the credentials \"\u003cUserName\u003e\" \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks login",
  "keyword": "And "
});
formatter.step({
  "name": "user verifies the login page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ]
    },
    {
      "cells": [
        "Thulasi",
        "123456"
      ]
    },
    {
      "cells": [
        "Rose",
        "45673"
      ]
    },
    {
      "cells": [
        "Lily",
        "4567t3"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To test login functionality of facebook",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user launches the url \"https://www.facebook.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "loginModule.steps.user_launches_the_url(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user inputs the credentials \"Thulasi\" \"123456\"",
  "keyword": "When "
});
formatter.match({
  "location": "loginModule.steps.user_inputs_the_credentials(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks login",
  "keyword": "And "
});
formatter.match({
  "location": "loginModule.steps.user_clicks_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginModule.steps.user_verifies_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To test login functionality of facebook",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user launches the url \"https://www.facebook.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "loginModule.steps.user_launches_the_url(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user inputs the credentials \"Rose\" \"45673\"",
  "keyword": "When "
});
formatter.match({
  "location": "loginModule.steps.user_inputs_the_credentials(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks login",
  "keyword": "And "
});
formatter.match({
  "location": "loginModule.steps.user_clicks_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginModule.steps.user_verifies_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To test login functionality of facebook",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user launches the url \"https://www.facebook.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "loginModule.steps.user_launches_the_url(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user inputs the credentials \"Lily\" \"4567t3\"",
  "keyword": "When "
});
formatter.match({
  "location": "loginModule.steps.user_inputs_the_credentials(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks login",
  "keyword": "And "
});
formatter.match({
  "location": "loginModule.steps.user_clicks_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginModule.steps.user_verifies_the_login_page()"
});
formatter.result({
  "status": "passed"
});
});