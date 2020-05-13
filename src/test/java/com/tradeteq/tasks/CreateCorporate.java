package com.tradeteq.tasks;

import com.TradeTeq.model.CorporateModel;
import com.tradeteq.pageobject.CreateCorporateFormPage;
import com.tradeteq.pageobject.DashBoardPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.actions.ScrollToTarget;
import net.serenitybdd.screenplay.questions.JavaScript;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.components.Dropdown;

import java.util.Random;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateCorporate implements Task {

    private CorporateModel corporateInformation;

    public static CreateCorporate createCorporateWith(CorporateModel CorporateInformation) {
        return instrumented(CreateCorporate.class, CorporateInformation);
    }

    @Step("{0} create Corporate with following information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DashBoardPage.menuOperation),
                Click.on(DashBoardPage.buttonCreateNewOperator),
                Enter.theValue(corporateInformation.txtIntCorporateID).into(CreateCorporateFormPage.txtIntCorporateID),
                Enter.theValue(corporateInformation.txtDUNSNumber).into(CreateCorporateFormPage.txtDUNSNumber),
                Enter.theValue(corporateInformation.txtLegalentityIdentifier).into(CreateCorporateFormPage.txtLegalentityIdentifier),
                Enter.theValue(corporateInformation.txtUKCompanyNumber).into(CreateCorporateFormPage.txtUKCompanyNumber),
                Enter.theValue(corporateInformation.txtName).into(CreateCorporateFormPage.txtName),
                Enter.theValue(corporateInformation.txtSummaryDescription).into(CreateCorporateFormPage.txtSummaryDescription),
                new  ScrollToTarget(CreateCorporateFormPage.txtPrivateName),
                Enter.theValue(corporateInformation.txtPrivateName).into(CreateCorporateFormPage.txtPrivateName),
                Enter.theValue(corporateInformation.txtPrivateNameContact).into(CreateCorporateFormPage.txtPrivateNameContact),
                Enter.theValue(corporateInformation.txtPrivateEmailContact).into(CreateCorporateFormPage.txtPrivateEmailContact),
                Enter.theValue(corporateInformation.txtCompanyRegistrationNumber).into(CreateCorporateFormPage.txtCompanyRegistrationNumber),
                Click.on(CreateCorporateFormPage.btnBusinessAddress),
                Click.on(CreateCorporateFormPage.txtBusinessAddress_Add1),
                Enter.theValue(corporateInformation.txtBusinessAddress_Add1).into(CreateCorporateFormPage.txtBusinessAddress_Add1),
                Enter.theValue(corporateInformation.txtBusinessAddress_City).into(CreateCorporateFormPage.txtBusinessAddress_City),
                Click.on(CreateCorporateFormPage.txtBusinessAddress_Country),
                Click.on(CreateCorporateFormPage.countryAfghanistan),
                Click.on(CreateCorporateFormPage.buttonOkOnBusinessForm),
                Click.on(CreateCorporateFormPage.buttonCreate)
        );
    }

    public CreateCorporate(CorporateModel paramsCorporateInformation)
    {
        this.corporateInformation = paramsCorporateInformation;
    }


}
