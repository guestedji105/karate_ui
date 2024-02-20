Feature: Login

  Background:
    #               System.properties
    * def baseUrl = karate.properties['baseUrl']
    * def username = karate.properties['userName']
    * def password = karate.properties['password']
    * def lp = Java.type('org.example.locators.LoginPageLocators').LoginLocatorsMap
    * configure driver = { type: 'chrome', showDriverLog: true }

  Scenario: Login success test
    Given driver baseUrl
    When focus(lp.loginInput)
    And input(lp.loginInput, username)
    And focus(lp.passwordInput)
    And input(lp.passwordInput, password)
    And click(lp.loginButton)
    Then waitFor(lp.appLogo)
    Then match driver.url == baseUrl + 'inventory.html'