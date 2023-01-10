package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import pojos.Item;
import pojos.Pet;
import services.PetService;

import org.apache.http.HttpStatus;
import org.junit.Assert;

import java.util.ArrayList;


public class StepDefinitions {
    String petId;
    String editedName = "Pet name edit";

    @Given("user adds a new pet")
    public void userAddsANewPet() throws Throwable {
        Pet petPayload = petBuilder("0", "pet name test");
        petId = PetService.postPet(petPayload, HttpStatus.SC_OK)
                .extract()
                .body()
                .path("id")
                .toString();
    }

    @Given("user modifies the pet")
    public void userModifiesAPet() {
        Pet petPayload = petBuilder(petId, editedName);
        PetService.putPet(petPayload, HttpStatus.SC_OK);
    }

    @Then("the pet contains the changes")
    public void thePetContainsTheChanges() {
        String responseName = PetService.getPet(petId, HttpStatus.SC_OK)
                .extract()
                .body()
                .path("name")
                .toString();
        Assert.assertEquals(responseName, editedName);
    }

    public Pet petBuilder(String id, String name) {
        return Pet.builder()
                .id(id)
                .name(name)
                .category(Item.builder()
                        .id("0")
                        .name("string")
                        .build())
                .photoUrls(new ArrayList<>())
                .tags(new ArrayList<Item>())
                .status("available")
                .build();
    }
}
