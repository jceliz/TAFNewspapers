package com.newspapers;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(publish = false,

        glue = {
                "com.newspapers",
        },
        plugin = {
                "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"
        }, monochrome = false,
        features = {
                "classpath:features"
        }
        ,
        tags = "@Login"
)
public class TestRunner {
}