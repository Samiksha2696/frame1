Feature:Login and Password
  Scenario: Verify for valid username and password
    Given chrome browser,open orangeHRM application
    When user enter username and password
    And click on login button
    Then user will br on homepage