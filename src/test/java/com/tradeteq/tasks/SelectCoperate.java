package com.tradeteq.tasks;

import com.tradeteq.pageobject.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnBy;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectCoperate implements Task {

    private By countryId;

    @Override
    @Step("{0} select Corporate with #id ")
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(new ClickOnBy(countryId));
    }

    public static SelectCoperate with(String id) {
        return instrumented(SelectCoperate.class, id);
    }

    public SelectCoperate(String id)
    {
        this.countryId =  By.xpath("//a[contains(text(), '" + id + "')]");
    }
}
