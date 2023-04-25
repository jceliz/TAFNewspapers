package com.newspapers.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ApiSteps extends BaseStepDef{


    @Given("existing Server application")
    public void existingServerApplication() {
    }

    @Then("on GET request to \\/users it returns expected users list")
    public void onGETRequestToUsersItReturnsExpectedUsersList() {
    }

    @Then("on GET request to \\/new it returns expected welcome message")
    public void onGETRequestToNewItReturnsExpectedWelcomeMessage() {
    }

    @Then("on GET request to \\/ it returns {int} and expected message")
    public void onGETRequestToItReturnsAndExpectedMessage(int arg0) {
    }

    @Then("on GET request to \\/nonexisting it returns {int} status code")
    public void onGETRequestToNonexistingItReturnsStatusCode(int arg0) {
    }

    @Then("adding new user <name> with email <email> it returns expected response <response>")
    public void addingNewUserNameWithEmailEmailItReturnsExpectedResponseResponse() {
    }
}
