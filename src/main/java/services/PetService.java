package services;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import pojos.Pet;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class PetService {
    private static String baseURL = "https://petstore.swagger.io/v2/pet";

    private static Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("accept",  "application/json");
        return headers;
    }

    public static ValidatableResponse postPet(Pet petPayload, Integer expected) {
        RequestSpecification requestSpecification = new RequestSpecBuilder()
                .setBaseUri(baseURL)
                .addHeaders(getHeaders())
                .build();
        return given()
                .spec(requestSpecification)
                .when()
                .body(petPayload)
                .post()
                .then()
                .assertThat().statusCode(expected)
                .assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/PetJsonSchema.json"));
    }

    public static ValidatableResponse getPet(String id, Integer expected) {
        RequestSpecification requestSpecification = new RequestSpecBuilder()
                .setBaseUri(baseURL)
                .setBasePath("/" + id)
                .addHeaders(getHeaders())
                .build();
        return given()
                .spec(requestSpecification)
                .when()
                .get()
                .then()
                .assertThat().statusCode(expected)
                .assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/PetJsonSchema.json"));
    }

    public static ValidatableResponse putPet(Pet petPayload, Integer expected) {
        RequestSpecification requestSpecification = new RequestSpecBuilder()
                .setBaseUri(baseURL)
                .addHeaders(getHeaders())
                .build();
        return given()
                .spec(requestSpecification)
                .when()
                .body(petPayload)
                .put()
                .then()
                .assertThat().statusCode(expected)
                .assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/PetJsonSchema.json"));
    }
}
