
# Api Cucumber Rest Assured test

Repository for Petstore swagger (Based on 10 Minute Tutorial from Cucumber)

Currently using java 8, cucumber, junit and restassured.



## Acknowledgements

- Test scenarios are located on src/test/resources/hellocucumber/pet.feature
- Test steps are located on src/test/java/steps/StepDefinitions.java
- Pet services are defined on src/main/java/services/PetService.java
- For json payloads and responses implements pojos, located on src/main/java/pojos
- Uses the default spec report
## Running Tests

Make sure to install all dependecies with `mvn install`

To run tests, run the following command:

```bash
  mvn test
```
