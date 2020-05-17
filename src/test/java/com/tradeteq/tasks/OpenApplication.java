package com.tradeteq.tasks;

import com.tradeteq.pageobject.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class OpenApplication implements Task {

    private HomePage homePage;

    public static OpenApplication onTheHomePage() {
        return instrumented(OpenApplication.class);
    }

    @Step("{0} opens the application on the home page")
    public <T extends Actor> void performAs(T actor) {
        getDriver().manage().window().maximize();
        actor.attemptsTo(Open.browserOn().the(homePage));
    }
}
