package dossier;

import static org.junit.Assert.assertEquals;

import java.util.List;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dossier_app.fichier;

public class fichierSteps {
    private Cadeau cadeau;
    int cadeau_sapin=0;

    @Given("Pere Noel prend un cadeau")
    public void Pere_Noel_prend_un_cadeau(String x) {
        cadeau.nmb = 1;
    }

    @When("Pere Noel dépose le cadeau au pied du sapin")
    public void Pere Noel dépose_le_cadeau_au_pied_du_sapin(){
        cadeau_sapin = cadeau.get_cadeau();
        cadeau.nmb=0;
    }

    @Then("il y a un cadeau au pied du sapin")
    public void il_y_a_un_cadeau_au_pied_du_sapin(){
        assertEquals(1, cadeau_sapin);
    }
}