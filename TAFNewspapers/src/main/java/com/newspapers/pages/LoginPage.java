package com.newspapers.pages;


import com.newspapers.locators.LoginPageLocators;

public class LoginPage extends BasePage{


    public void verifyTitle() {
        String actualTitle = webDriver.getTitle();
        String expectedTitle = "Historical Newspapers from 1700s-2000s - Newspapers.com";
        if(actualTitle.equalsIgnoreCase(expectedTitle))
            System.out.println("Title Matched");
        else {
            System.out.println("Title didn't match");
            closeBrowser();
        }
    }

    public void clickSignInButton() {
        clickElement(LoginPageLocators.BTN_SIGNIN);
    }

    public void signInToNewspapersComPopUpIsDisplayed() {
        fluentWaitLocator(LoginPageLocators.BTN_NEWSPAPERSCOM);
    }


    public void userInputsEmail(String newspapersUser) {
        sendKey(LoginPageLocators.TF_USERNAME, newspapersUser);
    }

    public void userInputsPassword(String newspapersPass) {
        sendKey(LoginPageLocators.TF_PASSWORD, newspapersPass);
    }

    public void userClicksSignInWithNewspapersComButton() {
        clickElement(LoginPageLocators.BTN_NEWSPAPERSCOM);
    }
}
