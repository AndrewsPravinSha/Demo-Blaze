Feature: Validation of ForgotPassword Link

  Scenario Outline: Validating the ForgotPassword Link
    Given launch the url
    When click the ForgotPassword link
    Then enter the "<inputs>"
    And click the search button

    Examples: 
      | inputs |
      | dummy  |
      | orgId  |
