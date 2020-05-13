package com.tradeteq.pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

@DefaultUrl("https://pycotest.tradeteq.com/operations/88c40ac6-1136-4e8f-94fb-a1aee76b3910/corporate/corporates-banks")
public class HomePage extends PageObject {

    //SELECTORS

    public static final Target emailField = Target.the("User Name Field").locatedBy("//input[@type='email']");

    public static final Target passwordField = Target.the("Password Field").locatedBy("//input[@type='password']");

    public static final Target btnSignIn = Target.the("Sign In button").locatedBy("//button[@id='next']");

    public HomePage(WebDriver driver){
        super(driver);
    }

    public void openApplication() {
        open();
        waitForTheApplicationToLoad();
    }

    private void waitForTheApplicationToLoad() {
        withTimeoutOf(60, TimeUnit.SECONDS).waitFor("//input[@type='email']");
    }
}
