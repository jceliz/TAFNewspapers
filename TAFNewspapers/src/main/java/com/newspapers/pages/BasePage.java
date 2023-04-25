package com.newspapers.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;
import java.util.function.Function;

public class BasePage {

    protected static WebDriver webDriver;

    public void resetPageFactory(WebDriver driver) {
        webDriver = driver;
        PageFactory.initElements(webDriver, this);
    }

    public void closeBrowser() {
        webDriver.quit();
    }

    public void navigateToBrowser(String url) {
        webDriver.navigate().to(url);
    }

    public void maximizeBrowser() {
        webDriver.manage().window().maximize();
    }

    public void clickElement(By locator) {
        fluentWaitLocator(locator);
        explicitElementToBeClickable(locator);
        webDriver.findElement(locator).click();
    }


    public void sendKey(By locator, String value) {
        WebElement element = webDriver.findElement(locator);
        fluentWaitLocator(locator);
        element.sendKeys(value);
    }

    public void explicitElementToBeClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(webDriver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public WebElement getElement(By locator) {
        return webDriver.findElement(locator);
    }

    public WebElement fluentWaitLocator(By locator) {
        /** Waiting 30 seconds for an element to be present on the page, checking
         for its presence once every 5 seconds. */
        final String locatorToString = locator.toString();
        String[] parts = locatorToString.split(" ", 2);
        final String finalLocator = parts[1];
        Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement element = null;
                if (locatorToString.contains("By.xpath:"))
                    element = driver.findElement(By.xpath(finalLocator));
                else if (locatorToString.contains("By.id:"))
                    element = driver.findElement(By.id(finalLocator));
                else if ((locatorToString.contains("By.name:")))
                    element = driver.findElement(By.name(finalLocator));
                return element;
            }
        });
        return foo;
    }

    public String getText(By locator) {
        String value = getElement(locator).getText();
        return value;
    }

}
