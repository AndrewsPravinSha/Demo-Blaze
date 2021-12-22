@cred
Feature: Validating the LoginPage Functionality

  Background: 
    Given launch the url

  @signUp(order=1)
  Scenario Outline: validating the signUp page
    When click the signUp button
    Then enter the "<userName>" and "<passWord>"
    And click the signUp submit button
    And verify the account is created

    Examples: 
      | userName | passWord |
      |          |          |
      | admin    |          |
      |          | qwerty   |
      | admin    | admin123 |

  @logIn(order=2)
  Scenario Outline: validating the loginPage
    When click the loginPage
    Then pass the "<userName>" and "<passWord>"
    And click the logIn button
    And verify whether logged in
    
    Examples: 
      | userName | passWord |
      |          |          |
      | admin    |          |
      |          | qwerty   |
      | admin    | admin123 |
