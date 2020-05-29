package main;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dedoublement {

    @When("je veux")
    public void je_veux() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("je crée un second compte avec le même montant")
    public void je_crée_un_second_compte_avec_le_même_montant() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
