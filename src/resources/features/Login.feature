Feature: Login functionality

  Scenario Outline: Login with valid credentials
    Given User navigates to login page
    When User has entered valid email address <username> into email field
    And User has entered valid password <password> into password field
    And user clicks on Login button
    Then User should get successfully logged in

    Examples:
      | username            | password  |
      | ncmalala@gmail.com  | password  |
      | ncmalala@gmail2.com | password1 |
      | ncmalala@gmail3.com | password2 |

  Scenario: Login with invalid credentials
    Given User navigates to login page
    When User enters invalid email address "amotooricsd123ap9@gmail.com" into email field
    And User enters invalid password "123456789" into password field
    And user clicks on Login button
    Then User should get a proper warning message about credentials mismatch

  Scenario: Login with invalid email and invalid password
    Given User navigates to login page
    When User enters invalid email address "amotooric9ap9@gmail.com" into email field
    And User enters invalid password "123456789" into password field
    And user clicks on Login button
    Then User should get a proper warning message about credentials mismatch


  Scenario: Login with invalid email and valid password
    Given User navigates to login page
    When User enters invalid email address "ncmalal1a@gmail.com" into email field
    And User has entered valid password "password" into password field
    And user clicks on Login button
    Then User should get a proper warning message about credentials mismatch


  Scenario: Login without providing any credentials
    Given User navigates to login page
    When User dont enter  email address into email field
    And User dont enter password into password field
    And user clicks on Login button
    Then User should get a proper warning message about credentials mismatch


