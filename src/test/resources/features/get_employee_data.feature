Feature: Employees Data

  Scenario: Get employee Data
    Given I want get employee data with id 1
    Then Status Code 200 and Message "Successfully! Record has been fetched."
    And Employee must have an ID
    And Employee must have a first and last name
    And Employee must be of legal age
    And Employee must have a salary greater than zero