Feature: Login Action


  Scenario Outline: Successful login with valid credentials
    Given User should open the application
    When User should click on the login link
    And User enters "<username>" and "<password>"
    Then Message displayed login successfully

  

    Examples: 
      | username | password | 
      | AlexUser |   AlexUser |
      | Alex@123 |  Alex@123 |
     