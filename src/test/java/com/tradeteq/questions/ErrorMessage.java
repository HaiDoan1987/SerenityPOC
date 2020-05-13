package com.tradeteq.questions;

import com.tradeteq.pageobject.CorporateDetailPage;
import com.tradeteq.pageobject.CreateCorporateFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ErrorMessage implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(CreateCorporateFormPage.errorMessage)
                .viewedBy(actor).asString();
    }

    public static ErrorMessage text() {
        return new ErrorMessage();
    }
}
