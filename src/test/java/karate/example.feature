Feature: Example from Karate Labs site

  Scenario: Sauce labs login and url match
    Given driver 'https://www.saucedemo.com/'
    When input('input[id=user-name]', 'standard_user')
    And input('input[id=password]', 'secret_sauce')
    And click('input[id=login-button]')
    Then waitFor('div[class=app_logo]')
    And match driver.url == 'https://www.saucedemo.com/inventory.html'