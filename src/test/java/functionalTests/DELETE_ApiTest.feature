Feature: Test localhost API for DELETE request
  Background: User authorised to use baseURI
    Given User is on baseURI

  Scenario: User is able to delete specific USERS details
    When User try to delete specific USERS block
    Then that USERS details must be deleted

  Scenario: User is able to delete specific SUBJECTS details
    When User try to delete specific SUBJECTS block
    Then that SUBJECTS details must be deleted

  Scenario: User is able to delete specific LOCATION details
    When User try to delete specific LOCATION block
    Then that LOCATION details must be deleted
