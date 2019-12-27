package cucumber.test.steps;

import aquality.selenium.browser.BrowserManager;
import cucumber.api.java.en.Given;

public class Steps {

    @Given("first step")
    public void testGiven() {
        BrowserManager.getBrowser().goTo("https://www.google.com/");
        System.out.println("First step");
    }
}
