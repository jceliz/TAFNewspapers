package com.newspapers;


import com.newspapers.config.NewspapersTestConfig;
import com.newspapers.stepdefinitions.BaseStepDef;
import io.cucumber.java.Before;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import com.newspapers.config.*;


@CucumberContextConfiguration
@SpringBootTest(
        classes = {NewspapersTestConfig.class}
)
public class Hooks extends BaseStepDef {

    @Before
    public void initPages() {
        basePage.resetPageFactory(webDriver);
        loginPage.resetPageFactory(webDriver);
        homePage.resetPageFactory(webDriver);

    }
}
