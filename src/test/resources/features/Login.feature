@AutomationExercise @Login

Feature: Login into Automation Exercise


  @PositiveFlow
  Scenario: Login into automation exercise application
    Given user launch automation exercise
    Then user click on login link
    And user enters "baranivasan2002@gmail.com" username and "Barani24" password
    Then user verify "Baranivasan" logged in successfully

  @NegativeFlow
  Scenario Outline: Login into automation exercise with <scenariotype>

    Given user launch automation exercise
    Then user click on login link
    And user enters "<username>" username and "<password>" password
    And user verify "<message>" in login page

    Examples:
      | scenariotype                        | username                  | password | message                              |
      | valid username and invalid password | baranivasan2002@gmail.com | user     | Your email or password is incorrect! |
      | invalid username and valid password | user@gmail.com            | user     | Your email or password is incorrect! |

