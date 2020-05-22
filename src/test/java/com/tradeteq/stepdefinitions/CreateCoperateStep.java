package com.tradeteq.stepdefinitions;

import com.TradeTeq.model.CorporateModel;
import com.tradeteq.pageobject.CreateCorporateFormPage;
import com.tradeteq.pageobject.DashBoardPage;
import com.tradeteq.questions.CorporateDetailsInformation;
import com.tradeteq.questions.ErrorMessage;
import com.tradeteq.tasks.CreateCorporate;
import com.tradeteq.tasks.Login;
import com.tradeteq.tasks.OpenApplication;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.Before;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnTarget;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.Stage;
import net.thucydides.core.annotations.Managed;

import org.openqa.selenium.WebDriver;

import java.util.Random;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.ConsequenceMatchers.displays;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class CreateCoperateStep {
    private Actor Hai = Actor.named("Hai");
    protected String userName = "automationpoc@yopmail.com";
    protected String password = "1qazZAQ!";

    private CorporateModel corporateInformation = new CorporateModel();
    
    @Before
    public void HaiCanBrowserTheWeb()
    {
        OnStage.setTheStage(new OnlineCast());
        WebDriverManager.chromedriver().setup();
    }

    @Given("{actor} login to application successfully")
    public void loginSuccessfully(Actor actor)
    {
        actor.wasAbleTo(OpenApplication.onTheHomePage());
        actor.wasAbleTo(Login.with(userName, password));

    }

    @When("{actor} goes to Coperate Form")
    public void NavigateToCreateCoperateForm(Actor actor)
    {
        actor.wasAbleTo(   Click.on(DashBoardPage.menuOperation),
                Click.on(DashBoardPage.buttonCreateNewOperator));
    }

    @Then("{actor} could create successfully a Corporate with {} CorporateID, {} DUNS Number, {} Legalentity Identifier, {} UK Company Number, {} name, {} Summary Description, {} Private Name, {} Private Name Contact, {} Private Email Contact ,{} Business Address Add1, {} Business Address City, {} Business Address Country, {} Company Registration Number")
    public void createSuccessfullyCorporate(Actor actor,
                                            String txtIntCorporateID,
                                            String txtDUNSNumber,
                                            String txtLegalentityIdentifier,
                                            String txtUKCompanyNumber,
                                            String txtName,
                                            String summaryDescription,
                                            String privateName,
                                            String privateNameContact,
                                            String privateEmailContact,
                                            String businessAddressAdd1,
                                            String businessAddressCity,
                                            String BusinessAddressCountry,
                                            String companyRegistrationNumber)

    {
        corporateInformation.txtIntCorporateID = getRandomNumberString(99999);
        corporateInformation.txtDUNSNumber = getRandomNumberString(99999);
        corporateInformation.txtLegalentityIdentifier = "HoD Auto" + getRandomNumberString(999);
        corporateInformation.txtUKCompanyNumber = getRandomNumberString(99999);
        corporateInformation.txtName = txtName;
        corporateInformation.txtSummaryDescription = summaryDescription;
        corporateInformation.txtPrivateName = privateName;
        corporateInformation.txtPrivateNameContact = privateNameContact;
        corporateInformation.txtPrivateEmailContact = privateEmailContact;
        corporateInformation.txtBusinessAddress_Add1 = businessAddressAdd1;
        corporateInformation.txtBusinessAddress_City = businessAddressCity;
        corporateInformation.txtBusinessAddress_Country = BusinessAddressCountry;
        corporateInformation.txtCompanyRegistrationNumber = getRandomNumberString(99999);

        actor.wasAbleTo(CreateCorporate.createCorporateWith(corporateInformation));
    }

    @Then("{actor} validate the Corporate information which just input")
    public void verifyCoperateInformation(Actor actor)
    {
        actor.should(seeThat(CorporateDetailsInformation.information(),
                displays("txtSummaryDescription", equalTo(corporateInformation.txtSummaryDescription)),
                displays("txtIntCorporateID", equalTo(corporateInformation.txtIntCorporateID)),
                displays("txtUKCompanyNumber", equalTo(corporateInformation.txtUKCompanyNumber)),
                displays("txtPrivateName", equalTo(corporateInformation.txtPrivateName))));
    }


    @When("{actor} click on Corporate ID field")
    public void selectIntCorporateID(Actor actor)
    {
        actor.wasAbleTo(new ClickOnTarget(CreateCorporateFormPage.txtIntCorporateID));
    }

    @Then("{actor} verify that the {string} error message is displayed")
    public void VerifyDisplayingTheRequiredErrorMessage(Actor actor, String errorMessage)
    {
        actor.should(seeThat(ErrorMessage.text(),
                is(errorMessage)));
    }

    public  String getRandomNumberString(int range) {
        Random rnd = new Random();
        int number = rnd.nextInt(range);
        return String.valueOf(number);
    }
}
