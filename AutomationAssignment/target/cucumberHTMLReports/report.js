$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/Automation.feature");
formatter.feature({
  "name": "Test Order a Product and Updation of Personal Information.",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the url of the application under test",
  "keyword": "Given "
});
formatter.match({
  "location": "AutomationPractice.getUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Order a Product",
  "description": "    In this Scenario we will Order a T-Shirt and verify the purchase in Order History",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ProductPurchase"
    }
  ]
});
formatter.step({
  "name": "user is on the website, login with the following credentials",
  "rows": [
    {
      "cells": [
        "johndoe@email.com",
        "password"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.loginWithValidCredentials(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on My Store click on T-Shirts Menu and Order a T-Shirt",
  "keyword": "When "
});
formatter.match({
  "location": "AutomationPractice.orderTShirt()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify order is placed successfully in Order History",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationPractice.verifyOrderHistory()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the url of the application under test",
  "keyword": "Given "
});
formatter.match({
  "location": "AutomationPractice.getUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Update Personal Information (First Name) in My Account",
  "description": "    In this Scenario we will navigate to My Account and Update First Name with a New String value",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UpdateInformation"
    }
  ]
});
formatter.step({
  "name": "user is on the website, navigate to My Personal Information Page",
  "rows": [
    {
      "cells": [
        "johndoe@email.com",
        "password"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.updatePersonalInfo(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on Your Personal Information Page, update First Name",
  "keyword": "When "
});
formatter.match({
  "location": "AutomationPractice.updateFirstName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify if the success message \"Your personal information has been successfully updated.\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationPractice.verifyUpdatedInformation(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});