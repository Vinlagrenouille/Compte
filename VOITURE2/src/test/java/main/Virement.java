package main;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class Virement {

    private CompteCourant compte;
    private Transaction transaction;

    @Given("j'ai un compte bancaire")
    public void j_ai_un_compte_bancaire() {
        compte = new CompteCourant(5);
    }

    @When("une transaction a lieu")
    public void une_transaction_a_lieu() {
        transaction = new Transaction(compte, 10);
    }

    @Then("mon compte est crédité de cet argent")
    public void mon_compte_est_crédité_de_cet_argent() {
        transaction.validerTransaction();
    }

}
