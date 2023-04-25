package com.newspapers.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class HomePageStepDef extends BaseStepDef{

    @Then("username - {string} is displayed as sign of successful login")
    public void usernameIsDisplayedAsSignOfSuccessfulLogin(String username) {
            homePage.verifyUsername(username);
    }

    @And("user closes the browser")
    public void userClosesTheBrowser() {
        homePage.closeBrowser();
    }
}
