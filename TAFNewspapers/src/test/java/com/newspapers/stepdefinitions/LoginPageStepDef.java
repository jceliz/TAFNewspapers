package com.newspapers.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef extends BaseStepDef{


    @Given("user is on newspapers.com page")
    public void userIsOnNewspapersPage() {
        loginPage.navigateToBrowser(newspapersURL);
        loginPage.maximizeBrowser();
        loginPage.verifyTitle();
    }


    @And("user clicks Sign-in button")
    public void userClicksSignInButton() {
        loginPage.clickSignInButton();
    }

    @Then("Sign in to Newspapers.com pop-up is displayed")
    public void signInToNewspapersComPopUpIsDisplayed() {
        loginPage.signInToNewspapersComPopUpIsDisplayed();
    }

    @When("user inputs email address")
    public void userInputsEmail() {
        loginPage.userInputsEmail(newspapersEmail);
    }

    @And("user inputs password")
    public void userInputsPassword() {
        loginPage.userInputsPassword(newspapersPass);
    }

    @And("user clicks Sign in with Newspapers.com button")
    public void userClicksSignInWithNewspapersComButton() {
        loginPage.userClicksSignInWithNewspapersComButton();
    }

}
