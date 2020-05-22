package com.tradeteq.questions;

import com.tradeteq.pageobject.CreateCorporateFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

@Subject("The expected Url should be '#url'")
public class Url implements Question<String> {
    private final String url;
    @Override
    public String answeredBy(Actor actor) {
        return getDriver().getCurrentUrl();
    }

    public static Url text(String urlLink) {
        return new Url(urlLink);
    }

    public Url(String url)
    {
        this.url = url;
    }
}
