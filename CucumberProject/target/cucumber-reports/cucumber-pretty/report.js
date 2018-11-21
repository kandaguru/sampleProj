$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/feature/example.feature");
formatter.feature({
  "line": 1,
  "name": "Check Login feature",
  "description": "",
  "id": "check-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login Verificaiton using valid using valid usenamre and password",
  "description": "",
  "id": "check-login-feature;login-verificaiton-using-valid-using-valid-usenamre-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Login to the Credit page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "clicked on Credit menu",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Credit Option Displays",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Login to the Debit page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "clicked on Debit menu",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Debit Option Displays",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Login to the Loan page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "clicked on Loan menu",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Loan Option Displays",
  "keyword": "Then "
});
formatter.match({
  "location": "BankStepDefenition.login_to_the_credit_page()"
});
formatter.result({
  "duration": 145769567,
  "status": "passed"
});
formatter.match({
  "location": "BankStepDefenition.clicked_on_credit_menu()"
});
formatter.result({
  "duration": 112817,
  "status": "passed"
});
formatter.match({
  "location": "BankStepDefenition.credit_option_displays()"
});
formatter.result({
  "duration": 75074,
  "status": "passed"
});
formatter.match({
  "location": "BankStepDefenition.login_to_the_debit_page()"
});
formatter.result({
  "duration": 1207341,
  "status": "passed"
});
formatter.match({
  "location": "BankStepDefenition.clicked_on_debit_menu()"
});
formatter.result({
  "duration": 84100,
  "status": "passed"
});
formatter.match({
  "location": "BankStepDefenition.debit_option_displays()"
});
formatter.result({
  "duration": 77946,
  "status": "passed"
});
formatter.match({
  "location": "BankStepDefenition.login_to_the_loan_page()"
});
formatter.result({
  "duration": 93946,
  "status": "passed"
});
formatter.match({
  "location": "BankStepDefenition.clicked_on_loan_menu()"
});
formatter.result({
  "duration": 80817,
  "status": "passed"
});
formatter.match({
  "location": "BankStepDefenition.loan_option_displays()"
});
formatter.result({
  "duration": 84510,
  "status": "passed"
});
});