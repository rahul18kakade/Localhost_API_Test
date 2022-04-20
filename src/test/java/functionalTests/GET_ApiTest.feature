Feature: Test localhost API for GET request

  Background: User is authorise to use baseURI
    Given User is on baseURI

  Scenario: User get list of USERS
    When User calls for users list
    Then User must get list of users

  Scenario: User get specific users information
    When User calls for specific Id number
    Then User should be getting same users information

  Scenario: User get list of SUBJECTS
    When User calls for subjects list
    Then User must get list of subjects

  Scenario: User get specific subjects information
    When User calls for specific Subject
    Then User should be getting same subjects information

  Scenario: User get list of LOCATION
    When User calls for location list
    Then User must get list of location

  Scenario: User get specific location information
    When User calls for specific location
    Then User should be getting same location information