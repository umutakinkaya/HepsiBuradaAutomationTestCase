$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("RegisterAndOrder.feature");
formatter.feature({
  "line": 1,
  "name": "HepsiBurada Automation Test Case",
  "description": "",
  "id": "hepsiburada-automation-test-case",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User launch and register the website, then order and checking functionality of website",
  "description": "",
  "id": "hepsiburada-automation-test-case;user-launch-and-register-the-website,-then-order-and-checking-functionality-of-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "i go to website with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "i click signin button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "i click emailspan",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "i click create an account button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "i fill the mandatory fields of the register form",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "i click register",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "i click home button and assert username",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "i click dresses \u003e summer dresses",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "i add a summer dress product in basket",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "i search summer on the searchbar",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "i add a summer dress product in basket",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "i click card \u003e checkout",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "i click proceed checkout",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "i click proceed checkout for shipping address",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "i click terms of signing of shipping",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "i click proceed checkout",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "i choose bankwire payment method",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "i click order confirmation",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "i click user account",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "i click order history and detail",
  "keyword": "Then "
});
formatter.match({
  "location": "Bindings.geturlchrome()"
});
formatter.result({
  "duration": 10277730200,
  "status": "passed"
});
formatter.match({
  "location": "Bindings.clicksigninbutton()"
});
formatter.result({
  "duration": 1632880600,
  "status": "passed"
});
formatter.match({
  "location": "Bindings.i_click_emailspan()"
});
formatter.result({
  "duration": 62369500,
  "status": "passed"
});
formatter.match({
  "location": "Bindings.i_click_create_an_account_button()"
});
formatter.result({
  "duration": 1629326900,
  "status": "passed"
});
formatter.match({
  "location": "Bindings.i_fill_form()"
});
formatter.result({
  "duration": 10935358300,
  "status": "passed"
});
formatter.match({
  "location": "Bindings.i_click_register_button()"
});
formatter.result({
  "duration": 4049358500,
  "status": "passed"
});
formatter.match({
  "location": "Bindings.i_click_home_button()"
});
formatter.result({
  "duration": 7280786100,
  "status": "passed"
});
formatter.match({
  "location": "Bindings.i_click_summmer_dresses()"
});
formatter.result({
  "duration": 8022289000,
  "status": "passed"
});
formatter.match({
  "location": "Bindings.i_add_summer_dress_basket()"
});
formatter.result({
  "duration": 2872705500,
  "status": "passed"
});
formatter.match({
  "location": "Bindings.si_search_summer_on_seachbar()"
});
formatter.result({
  "duration": 5734334900,
  "status": "passed"
});
formatter.match({
  "location": "Bindings.i_add_summer_dress_basket()"
});
formatter.result({
  "duration": 3885363400,
  "status": "passed"
});
formatter.match({
  "location": "Bindings.i_click_checkout()"
});
formatter.result({
  "duration": 5093279700,
  "status": "passed"
});
formatter.match({
  "location": "Bindings.i_click_proceed_checkout()"
});
formatter.result({
  "duration": 4592166100,
  "status": "passed"
});
formatter.match({
  "location": "Bindings.i_click_proceed_checkout_for_shipping_address()"
});
formatter.result({
  "duration": 5278700000,
  "status": "passed"
});
formatter.match({
  "location": "Bindings.i_click_terms_of_signing_shipping()"
});
formatter.result({
  "duration": 59617700,
  "status": "passed"
});
formatter.match({
  "location": "Bindings.i_click_proceed_checkout()"
});
formatter.result({
  "duration": 5266376700,
  "status": "passed"
});
formatter.match({
  "location": "Bindings.i_choose_bankwire_payment_method()"
});
formatter.result({
  "duration": 1936710700,
  "status": "passed"
});
formatter.match({
  "location": "Bindings.i_click_order_confirmation()"
});
formatter.result({
  "duration": 2226328200,
  "status": "passed"
});
formatter.match({
  "location": "Bindings.i_click_user_account()"
});
formatter.result({
  "duration": 766406000,
  "status": "passed"
});
formatter.match({
  "location": "Bindings.i_click_user_history_and_detail()"
});
formatter.result({
  "duration": 1381993900,
  "status": "passed"
});
formatter.after({
  "duration": 598079400,
  "status": "passed"
});
});