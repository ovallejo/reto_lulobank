Feature: Create Employees

  Scenario: Create Employee
    Given Create Employee Random Data
    When Create Employee
    Then Check Create Record Request