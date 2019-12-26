package cucumber.test.steps;

import cucumber.api.java.en.Given;

public class Steps {

    @Given("first step")
    public void testGiven() {
        System.out.println("First step");
    }
}
