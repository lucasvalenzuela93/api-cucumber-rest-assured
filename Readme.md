# Cucumber REST Assured API Tests

This repository contains automated tests for the [Petstore API](https://petstore.swagger.io/) based on the [10-Minute Cucumber Tutorial](https://cucumber.io/docs/guides/10-minute-tutorial/?lang=java).

## Technologies Used

- Java 8
- Cucumber
- JUnit
- Rest Assured

## Project Structure

- **Test Scenarios**: Located at `src/test/resources/hellocucumber/pet.feature`
- **Step Definitions**: Implemented in `src/test/java/steps/StepDefinitions.java`
- **Pet Services**: Defined in `src/main/java/services/PetService.java`
- **POJOs for JSON Payloads and Responses**: Found in `src/main/java/pojos`
- **Reports**: Uses the default specification report

## Getting Started

1. **Install Dependencies**: Run the following command to install all required dependencies:
   ```bash
   mvn install
2. **Run Tests**: Execute the tests using the command:
   ```bash
   mvn test
3. **View Cucumber Reports**: After running the tests, you can view your Cucumber report at: https://reports.cucumber.io/reports/{UUID}
