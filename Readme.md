
# Api Cucumber Rest Assured test

Repository for Petstore swagger (Based on 10 Minute Tutorial from Cucumber)

Currently using java 8, cucumber, junit and restassured.



## Acknowledgements

- Test scenarios are located on [`hellocucumber/pet.feature`](src/test/resources/hellocucumber/pet.feature)
- Test steps are located on [`steps/StepDefinitions.java`](src/test/java/steps/StepDefinitions.java)
- Pet services are defined on [`services/PetService.java`](src/main/java/services/PetService.java)
- For json payloads and responses implements pojos, located on [`pojos`](src/main/java/pojos)
- Uses the default spec report
## Running Tests

Make sure to install all dependecies with `mvn install`

To run tests, run the following command:

```bash
  mvn test
```
