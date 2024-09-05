Feature: Login scenarios

  @smoke
  Scenario: valid login to swag lab application
    Given user is able to launch the swag labs application in mobile
    When user enters username and password
    And user clicks on login button
    Then user is able to see homepage
