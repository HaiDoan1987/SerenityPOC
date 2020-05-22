Feature: Create Coperate

  @SmokeTest
  Scenario Outline: Verify that user could create Coperate successfully
    Given Hai login to application successfully
    When he goes to Coperate Form
    Then he could create successfully a Corporate with <CorporateID> CorporateID, <txtDUNSNumber> DUNS Number, <LegalentityIdentifier> Legalentity Identifier, <UKCompanyNumber> UK Company Number, <Name> name, <SummaryDescription> Summary Description, <PrivateName> Private Name, <PrivateNameContact> Private Name Contact, <PrivateEmailContact> Private Email Contact ,<BusinessAddress_Add1> Business Address Add1, <BusinessAddressCity> Business Address City, <BusinessAddressCountry> Business Address Country, <CompanyRegistrationNumber> Company Registration Number
    And he validate the Corporate information which just input
    Examples:
      | CorporateID | txtDUNSNumber | LegalentityIdentifier | UKCompanyNumber | Name | SummaryDescription | PrivateName | PrivateNameContact | PrivateEmailContact | BusinessAddress_Add1      | BusinessAddressCity       | BusinessAddressCountry | CompanyRegistrationNumber |
      | unique      | unique        | unique                | unique          | Hod  | Automation Script  | HoD auto    | HoD Contact        | HoDAuto1221@abc.com | HoD Business Address_Add1 | HoD Business Address City | Afghanistan            | unique                    |

    @SmokeTest
    Scenario: verify that there is error message
      Given Hai login to application successfully
      When he goes to Coperate Form
      And he click on Corporate ID field
      Then he verify that the "This field is required" error message is displayed
