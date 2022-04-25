Feature: Test localhost API for POST request

  Background: User is authorised use baseURI
    Given User is on baseURI

  Scenario: User is able to add new entry
    When User hits new entry
    Then New entry should be created

  Scenario: User is able to add new subject
    When User hits new subject
    Then New subject should be created

  Scenario: User is able to add new location
    When User hits new location
    Then New location should be created

