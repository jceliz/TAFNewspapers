package com.newspapers.config;

import com.newspapers.pages.BasePage;
import com.newspapers.pages.HomePage;
import com.newspapers.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.env.Environment;

import java.net.URL;

public class NewspapersTestConfig {

    @Autowired
    Environment environment;
    @Autowired
    protected static WebDriver webDriver;
    @Autowired
    protected ChromeOptions chromeOptions;
    @Autowired
    protected String browser;
    @Autowired
    protected String newspapersURL;
    @Autowired
    protected String newspapersEmail;
    @Autowired
    protected String newspapersPass;
    @Autowired
    protected String newspapersHost;

    @Bean
    public String newspapersHost() {
        newspapersHost = environment.getProperty("newspapers.host");
        return newspapersHost;
    }
    @Bean
    public String newspapersEmail() {
        newspapersEmail = environment.getProperty("newspapers.email");
        return newspapersEmail;
    }

    @Bean
    public String newspapersPass() {
        newspapersPass = environment.getProperty("newspapers.password");
        return newspapersPass;
    }

    @Bean
    public String browser() {
        browser = environment.getProperty("browser");
        return browser;
    }

    @Bean
    public String newspapersURL() {
        newspapersURL = environment.getProperty("newspapers.env");
        return newspapersURL;
    }

    @Bean
    public ChromeOptions chromeOptions() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1080");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-notifactions");
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--headless");
        String chromeDriverPath = "";
        chromeDriverPath = environment.getProperty("webdriver.chrome");
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        chromeOptions = options;
        return chromeOptions;
    }

    @Bean
    @DependsOn("chromeOptions")
    public WebDriver webDriver() throws Exception {
        if (browser.equals("chrome")) {
//            WebDriverManager.chromedriver().setup();
//            webDriver = new ChromeDriver(chromeOptions);
            webDriver = new RemoteWebDriver(new URL(newspapersHost), chromeOptions);

        }
        return webDriver;
    }

    @Bean
    @DependsOn("webDriver")
    public BasePage basePage() {
        return new BasePage();
    }

    @Bean
    @DependsOn("webDriver")
    public LoginPage loginPage() {
        return new LoginPage();
    }

    @Bean
    @DependsOn("webDriver")
    public HomePage homePage() {
        return new HomePage();
    }

}
