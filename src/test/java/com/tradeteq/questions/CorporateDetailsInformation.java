package com.tradeteq.questions;

import com.TradeTeq.model.CorporateModel;
import com.tradeteq.pageobject.CorporateDetailPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CorporateDetailsInformation implements Question<CorporateModel> {

    @Override
    public CorporateModel answeredBy(Actor actor) {
        String summaryDescription = Text.of(CorporateDetailPage.txtSummaryDescription)
                .viewedBy(actor).asString();
        String internalCorporateId = Text.of(CorporateDetailPage.txtIntCorporateID)
                .viewedBy(actor).asString();
        String legalEntityIdentifier = Text.of(CorporateDetailPage.txtLegalentityIdentifier)
                .viewedBy(actor).asString();
        String uKCompanyNumber = Text.of(CorporateDetailPage.txtUKCompanyNumber)
                .viewedBy(actor).asString();
        String privateName = Text.of(CorporateDetailPage.txtPrivateName)
                .viewedBy(actor).asString();
        String primaryNameContact = Text.of(CorporateDetailPage.txtPrivateNameContact)
                .viewedBy(actor).asString();
        String primaryEmailcontact = Text.of(CorporateDetailPage.txtPrivateEmailContact)
                .viewedBy(actor).asString();
        return new CorporateModel(summaryDescription, internalCorporateId, legalEntityIdentifier, uKCompanyNumber, privateName, primaryNameContact, primaryEmailcontact );
    }

    public static CorporateDetailsInformation information()
    {
        return new CorporateDetailsInformation();
    }
}
