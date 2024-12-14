Feature: Registering for IT jobs

  Scenario: User is registering for IT Jobs and validating the sumbission
    Given user is landed up on It jobs registraion page
    Then user is entering valid details in mandatory fields "Student", "Manoj" ,"Advanced Java Certification Training","xyz1234@gmail.com","xyz1234@gmail","xyz134@gmail","560068","India +91","9894645133" and registers
    And user creates an account and is validated
