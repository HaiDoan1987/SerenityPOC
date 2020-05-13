package com.TradeTeq.model;

public class CorporateModel {

    public String txtIntCorporateID;

    public String txtDUNSNumber;

    public String txtLegalentityIdentifier;

    public String txtUKCompanyNumber;

    public String txtACRA_UEN;

    public String txtName;

    public String txtSummaryDescription;

    public String txtPrivateName;

    public String txtPrivateNameContact;

    public String txtPrivateEmailContact;

    public String txtCompanyRegistrationNumber;

    public String txtBusinessAddress_Add1;

    public String txtBusinessAddress_City;

    public String txtBusinessAddress_Country;


    public CorporateModel(String txtIntCorporateID, String txtDUNSNumber, String txtLegalentityIdentifier, String txtUKCompanyNumber, String txtACRA_UEN, String txtName, String txtSummaryDescription, String txtPrivateName, String txtPrivateNameContact, String txtPrivateEmailContact, String txtCompanyRegistrationNumber, String txtBusinessAddress_Add1, String txtBusinessAddress_City, String txtBusinessAddress_Country) {
        this.txtIntCorporateID = txtIntCorporateID;
        this.txtDUNSNumber = txtDUNSNumber;
        this.txtLegalentityIdentifier = txtLegalentityIdentifier;
        this.txtUKCompanyNumber = txtUKCompanyNumber;
        this.txtACRA_UEN = txtACRA_UEN;
        this.txtName = txtName;
        this.txtSummaryDescription = txtSummaryDescription;
        this.txtPrivateName = txtPrivateName;
        this.txtPrivateNameContact = txtPrivateNameContact;
        this.txtPrivateEmailContact = txtPrivateEmailContact;
        this.txtCompanyRegistrationNumber = txtCompanyRegistrationNumber;
        this.txtBusinessAddress_Add1 = txtBusinessAddress_Add1;
        this.txtBusinessAddress_City = txtBusinessAddress_City;
        this.txtBusinessAddress_Country = txtBusinessAddress_Country;
    }

    public CorporateModel(String txtSummaryDescription) {
        this.txtSummaryDescription = txtSummaryDescription;
    }

    public CorporateModel() {

    }
}
