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
        return new CorporateModel(summaryDescription);
    }

    public static CorporateDetailsInformation information()
    {
        return new CorporateDetailsInformation();
    }
}
