package com.tradeteq.tasks;

import com.tradeteq.pageobject.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    private final String userName;

    private final String password;

    @Override
    @Step("{0} login with #userName and #password")
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(Enter.theValue(userName).into(HomePage.emailField),
                Enter.theValue(password).into(HomePage.passwordField),
                Click.on(HomePage.btnSignIn));
    }

    public static Login with(String userName, String password) {
        return instrumented(Login.class, userName, password);
    }

    public Login(String userName, String password)
    {
        this.userName = userName;
        this.password = password;
    }
}
