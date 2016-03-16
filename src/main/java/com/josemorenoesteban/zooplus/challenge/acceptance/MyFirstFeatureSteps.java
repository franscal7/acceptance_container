package com.josemorenoesteban.zooplus.challenge.acceptance;

import cucumber.api.java.en.Given;

public class MyFirstFeatureSteps {
    @Given("I have (\\d+) cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        System.out.format("The cukes are %s\n", cukes);
        assert cukes == 24 : "Cikes are not 24";
        //throw new cucumber.api.PendingException("Until this is not shwn it not finished!");
    }
}
