package com.qualims.maintenance.steps;

import com.qualims.maintenance.domain.FizzBuzz;
import cucumber.api.PendingException;
import cucumber.api.java8.En;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzStep implements En {

    private int entierMini;
    private int entierMaxi;
    private String resultatFizzBuzz;

    public FizzBuzzStep() {
        Given("^un intervalle entre \"([^\"]*)\" et \"([^\"]*)\"$", (String minimum, String maximum) -> {
            entierMini = Integer.parseInt(minimum);
            entierMaxi = Integer.parseInt(maximum);
        });
        When("^on vérifie le FizzBuzz sur cet intervalle$", () -> {
            resultatFizzBuzz = new FizzBuzz().generate(entierMini,entierMaxi);
        });
        Then("^le FizzBuzz retourne \"([^\"]*)\"$", (String resultat) -> {
            assertThat(resultatFizzBuzz).isEqualTo(resultat);
        });
    }
}
