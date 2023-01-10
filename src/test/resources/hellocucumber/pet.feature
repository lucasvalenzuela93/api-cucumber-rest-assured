Feature:
  Verify Swagger Petstore requests

  Scenario: A pet can be added and modified
    Given user adds a new pet
    When user modifies the pet
    Then the pet contains the changes
