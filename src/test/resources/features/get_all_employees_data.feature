Feature: All Employees Data

  Scenario: Get all employees Data
    Given I want get all employee data
    Then Status Code 200 and Message "Successfully! All records has been fetched."
    And All employees must have an ID
    And All employees must have a first and last name
    And All employees must be of legal age
    And All employees must have a salary greater than zero

