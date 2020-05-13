package com.tradeteq.pageobject;

import net.serenitybdd.screenplay.targets.Target;

public class CorporateDetailPage {
    public static final Target txtIntCorporateID = Target.the("Field Corporate ID").locatedBy("//input[@id='mat-input-6']");

    public static final Target txtDUNSNumber = Target.the("Field DUNSNumber").locatedBy("//input[@id='mat-input-7']");

    public static final Target txtLegalentityIdentifier = Target.the("field Legalentity Identifier").locatedBy("//input[@id='mat-input-8']");

    public static final Target txtUKCompanyNumber = Target.the("field UK Company Number").locatedBy("//input[@id='mat-input-9']");

    public static final Target txtName = Target.the("field Name").locatedBy("//input[@id='mat-input-0']");

    public static final Target txtSummaryDescription = Target.the("field Summary Description").locatedBy("//h3[contains(text(),'Company profile')]/following-sibling::p");

    public static final Target txtPrivateName = Target.the("field private name").locatedBy("//input[@id='mat-input-2']");

    public static final Target txtPrivateNameContact = Target.the("field private name contract").locatedBy("//input[@id='mat-input-3']");

    public static final Target txtPrivateEmailContact = Target.the("field private email contract").locatedBy("//input[@id='mat-input-4']");

    public static final Target txtCompanyRegistrationNumber = Target.the("field Company Registration Number").locatedBy("//input[@id='mat-input-5']");

    public static final Target btnBusinessAddress = Target.the("button Business Address").locatedBy("//app-address-box[@title='Business address']//span");

    public static final Target txtBusinessAddress_Add1 = Target.the("field Business Address Add1").locatedBy("//label[contains(text(),'Address 1')]/following-sibling::shared-input//input");

    public static final Target txtBusinessAddress_City = Target.the("field Business Address City").locatedBy("//label[contains(text(),'City')]/following-sibling::shared-input//input");

    public static final Target txtBusinessAddress_Country = Target.the("field Business Address Country").locatedBy("//label[contains(text(),'Country')]/following-sibling::shared-autocomplete-dropdown//input");
}
