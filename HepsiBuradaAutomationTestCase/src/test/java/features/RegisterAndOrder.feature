Feature: HepsiBurada Automation Test Case
  @regression
  Scenario: User launch and register the website, then order and checking functionality of website
    Given i go to website with chrome
    When i click signin button
    Then i click emailspan
    Then i click create an account button
    Then i fill the mandatory fields of the register form
    Then i click register
    Then i click home button and assert username
    Then i click dresses > summer dresses
    Then i add a summer dress product in basket
    Then i search summer on the searchbar
    Then i add a summer dress product in basket
    Then i click card > checkout
    Then i click proceed checkout
    Then i click proceed checkout for shipping address
    Then i click terms of signing of shipping
    Then i click proceed checkout
    Then i choose bankwire payment method
    Then i click order confirmation
    Then i click user account
    Then i click order history and detail







