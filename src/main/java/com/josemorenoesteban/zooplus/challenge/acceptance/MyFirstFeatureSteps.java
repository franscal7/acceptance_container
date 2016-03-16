package com.josemorenoesteban.zooplus.challenge.acceptance;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MyFirstFeatureSteps {
    private int cukes;
    
    @Given("I have (\\d+) cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        assert cukes == 24 : "Cukes are not 24";
        //throw new cucumber.api.PendingException("Until this is not shwn it not finished!");
    }

    @Given("I put (\\d+) cukes in my belly")
    public void I_put_cukes_in_my_belly(int cukes) {
        this.cukes = cukes;
    }
    
    @Then("I have more than (\\d+) cukes in my belly")
    public void I_have_more_than_N_cukes_in_my_belly(int cukes) {
        assert this.cukes > cukes : String.format("Cukes are less to equals than expected (result=%s, expected=%s)", cukes, this.cukes);
    }
}
