Feature: Registration on Demo web Shop
  Scenario: Successful user registration
    Given I am on the Home Page
    When I click on the "Register"
    When I enter the registration details
    When I click on "Register" button
    Then I should see the message "Your registration completed"

