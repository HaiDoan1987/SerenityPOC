package com.tradeteq.pageobject;

import net.serenitybdd.screenplay.targets.Target;

public class CorporateDetailPage {
    public static final Target txtIntCorporateID = Target.the("Field Corporate ID").locatedBy("//span[contains(text(),'Internal Corporate ID')]/following-sibling::span");

    public static final Target txtDUNSNumber = Target.the("Field DUNSNumber").locatedBy("//input[@id='mat-input-7']");

    public static final Target txtLegalentityIdentifier = Target.the("field Legalentity Identifier").locatedBy("//span[contains(text(),'Legal Entity Identifier')]/following-sibling::span");

    public static final Target txtUKCompanyNumber = Target.the("field UK Company Number").locatedBy("//span[contains(text(),'UK Company Number')]/following-sibling::span");

    public static final Target txtName = Target.the("field Name").locatedBy("//input[@id='mat-input-0']");

    public static final Target txtSummaryDescription = Target.the("field Summary Description").locatedBy("//h3[contains(text(),'Company profile')]/following-sibling::p");

    public static final Target txtPrivateName = Target.the("field private name").locatedBy("//span[contains(text(),'Private name')]/following-sibling::span");

    public static final Target txtPrivateNameContact = Target.the("field private name contract").locatedBy("//span[contains(text(),'Primary email contact')]/following-sibling::span");

    public static final Target txtPrivateEmailContact = Target.the("field private email contract").locatedBy("//span[contains(text(),'Primary email contact')]/following-sibling::span");

    public static final Target txtCompanyRegistrationNumber = Target.the("field Company Registration Number").locatedBy("//span[contains(text(),'Company registration number')]/following-sibling::span");

}
