package com.tradeteq.stepdefinitions;

import com.TradeTeq.model.CorporateModel;
import com.tradeteq.questions.Url;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.CurrentVisibility;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.Is.is;

public class NavigationStep {
    private Actor Hai = Actor.named("Hai");
    protected String userName = "automationpoc@yopmail.com";
    protected String password = "1qazZAQ!";

    private CorporateModel corporateInformation = new CorporateModel();

    @Then("{actor} could navigate to following pages by clicking")
    public void NavigateToCreateCoperateForm(Actor actor, DataTable table) throws InterruptedException {
        List<Map<String,String>> rows  = table.asMaps();
        for (Map<String, String> collumn : rows){
            Target elementMenuSubMenu = Target.the(collumn.get("Menu / Submenu")).locatedBy("//*[contains(text(),'"
                    + collumn.get("Menu / Submenu")+"')]");
            if (collumn.get("Menu / Submenu").contains("Marketplace")) {
                Thread.sleep(2000);
                elementMenuSubMenu = Target.the(collumn.get("Menu / Submenu")).locatedBy("//*[@class='marketplace-icon']");
            }
            if (collumn.get("Menu / Submenu").contains("Operations")){
                elementMenuSubMenu = Target.the(collumn.get("Menu / Submenu")).locatedBy("//*[@id='operations']");
            }
            Target elementPageHeader = Target.the(collumn.get("Page Header")).locatedBy("//*[contains(text(),'"
                    + collumn.get("Page Header")+"')]");
            if (collumn.get("Page Header").equals("Marketplace"))
            {
               elementPageHeader = Target.the(collumn.get("Menu / Submenu")).locatedBy("//*[contains(text(),'Marketplace')]");
            }
            actor.wasAbleTo( Click.on(elementMenuSubMenu));
            actor.should(seeThat(Url.text(collumn.get("Desired Url")), is(collumn.get("Desired Url"))));
            actor.should(seeThat(new CurrentVisibility(elementPageHeader, actor).asAQuestion(), is(true)));
        }
    }

    @Then("{actor} could navigate to following pages by hovering and clicking")
    public void verifyUserCouldHoverAndCLicking(Actor actor, DataTable table) throws InterruptedException {
        Thread.sleep(5000);
        List<Map<String,String>> rows  = table.asMaps();
        for (Map<String, String> collumn : rows){
            Target elementMenuMenu = null;
            if (collumn.get("Menu").equals("Trade"))
            {
                 elementMenuMenu = Target.the(collumn.get("Menu")).locatedBy("//div[@class='trade section-container']");
            }
            if (collumn.get("Menu").equals("My Company"))
            {
                elementMenuMenu = Target.the(collumn.get("Menu")).locatedBy("//*[@id='company']");
            }
            Target elementSubMenu = Target.the(collumn.get("Submenu")).locatedBy("//*[contains(text(),'"
                    + collumn.get("Submenu")+"')]");
            Target elementPageHeader = Target.the(collumn.get("Page Header")).locatedBy("//*[contains(text(),'"
                    + collumn.get("Page Header")+"')]");

            actor.wasAbleTo(Click.on(elementMenuMenu));
            actor.wasAbleTo(Click.on(elementSubMenu));
            actor.should(seeThat(Url.text(collumn.get("Desired Url")), is(collumn.get("Desired Url"))));
            actor.should(seeThat(new CurrentVisibility(elementPageHeader, actor).asAQuestion(), is(true)));
        }
    }
}
