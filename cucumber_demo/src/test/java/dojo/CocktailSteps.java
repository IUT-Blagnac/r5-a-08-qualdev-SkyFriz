package dojo;

import static org.junit.Assert.assertEquals;

import java.util.List;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dossier.Order;

public class CocktailSteps {
    private Order order;

    @Given("{string} who wants to buy a drink")
    public void Romeo_who_wants_to_buy_a_drink(String x) {
        order = new Order();
        order.declareOwner(x);
    }

    @When("an order is declared for {string}")
    public void an_order_is_declared_for_Juliette(String y){
        order.declareTarget(y);
    }

    @Then("there is no cocktail in the order")
    public void there_is_no_cocktail_in_the_order(int nmb){
        List<String> cocktails =  order.getCocktails();
        assertEquals(nmb, cocktails.size());
    }
}