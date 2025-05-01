@AutomationExercise @Cart

  Feature: Verify cart page functionality

    @PositiveFlow
    Scenario: Verify cart price

      Given user launch automation exercise
      Then user click on login link
      And user enters "baranivasan2002@gmail.com" username and "Barani24" password
      Then user verify "Baranivasan" logged in successfully

      And user click on Product link
      Then user click on view product link
      And user added the item in cart
      Then user click the view cart
      And user verify the item price
      Then user logout successfully
