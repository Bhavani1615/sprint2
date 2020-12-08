$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("registration.feature");
formatter.feature({
  "line": 1,
  "name": "Registration",
  "description": "",
  "id": "registration",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "User is on home page of the Demo Web Shop and Registration link is avaialble.",
  "description": "user has also clicked on the registration link",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 6,
  "name": "Successful Regisration with valid data",
  "description": "Description: to register, user needs to enter his Gender,First name,Last name,Email,password \u0026 confirm password",
  "id": "registration;successful-regisration-with-valid-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@SuccessfulRegistration"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User is on Demo webshop registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user enters Gender,valid First name,Valid Last name,valid password and matching confirmPassword",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Message displayed Registration Successful",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStepDefinition.user_is_on_Demo_webshop_registration_page()"
});
formatter.result({
  "duration": 23560553800,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDefinition.user_enters_Gender_valid_First_name_Valid_Last_name_valid_password_and_matching_confirmPassword()"
});
formatter.result({
  "duration": 8269000500,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDefinition.message_displayed_Registration_Successful()"
});
formatter.result({
  "duration": 2754851400,
  "status": "passed"
});
});