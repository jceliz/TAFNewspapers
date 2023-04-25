package com.newspapers.stepdefinitions;

import com.newspapers.pages.BasePage;
import com.newspapers.pages.HomePage;
import com.newspapers.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;


public class BaseStepDef {
    @Autowired
    protected Environment environment;
    @Autowired
    protected WebDriver webDriver;
    @Autowired
    protected String newspapersURL;
    @Autowired
    protected String newspapersEmail;
    @Autowired
    protected String newspapersPass;
    @Autowired
    public BasePage basePage;
    @Autowired
    protected LoginPage loginPage;
    @Autowired
    protected HomePage homePage;

}
