Feature: Registration on Demo web Shop
  Scenario: Successful user registration
    Given I am on the Demo Web Shop
    When I click on the "Register" link
    When I enter the registration details
    When I click on "Register" button
    Then I should see the message "Your registration completed"

