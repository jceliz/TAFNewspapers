package com.newspapers.pages;

import com.newspapers.locators.HomePageLocators;

public class HomePage extends BasePage {
    public void verifyUsername(String username) {
        fluentWaitLocator(HomePageLocators.BTN_CLIPPINGS);
        if (username.equals(getText(HomePageLocators.LBL_USERNAME))) {
            System.out.println("Username Match");
        } else {
            System.out.println("Username Not Match");
        }
    }
}
