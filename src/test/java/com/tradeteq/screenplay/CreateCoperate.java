package com.tradeteq.screenplay;

import com.TradeTeq.model.CorporateModel;
import com.tradeteq.pageobject.CreateCorporateFormPage;
import com.tradeteq.pageobject.DashBoardPage;
import com.tradeteq.questions.CorporateDetailsInformation;
import com.tradeteq.questions.ErrorMessage;
import com.tradeteq.tasks.CreateCorporate;
import com.tradeteq.tasks.OpenApplication;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnTarget;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.WithTag;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.util.Random;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.ConsequenceMatchers.displays;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

@RunWith(SerenityRunner.class)
@WithTag("screenplay")
public class CreateCoperate extends BaseTest{
    private Actor Hai = Actor.named("Hai");

    private CorporateModel corporateInformation = new CorporateModel();
    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    @Before
    public void HaiCanBrowserTheWeb()
    {
        WebDriverManager.chromedriver().setup();
        Hai.can(BrowseTheWeb.with(hisBrowser));
        givenThat(Hai).wasAbleTo(OpenApplication.onTheHomePage());
    }

    @Test
    public void CheckCorperateInformationAfterCreatingSuccessfully()
    {
        corporateInformation.txtIntCorporateID = getRandomNumberString(99999);
        corporateInformation.txtDUNSNumber = getRandomNumberString(99999);
        corporateInformation.txtLegalentityIdentifier = "HoD Auto" + getRandomNumberString(999);
        corporateInformation.txtUKCompanyNumber = getRandomNumberString(99999);
        corporateInformation.txtName = "HoDAuto";
        corporateInformation.txtSummaryDescription = "Automation Script";
        corporateInformation.txtPrivateName = "HoDAuto PrivateName";
        corporateInformation.txtPrivateNameContact = "HoDAuto Private Name ontact";
        corporateInformation.txtPrivateEmailContact = "HoDAuto1221@abc.com";
        corporateInformation.txtBusinessAddress_Add1 = "HoDAuto address 1";
        corporateInformation.txtBusinessAddress_City = "HoDAuto address city";
        corporateInformation.txtBusinessAddress_Country = "Afghanistan";
        corporateInformation.txtCompanyRegistrationNumber = getRandomNumberString(99999);

        givenThat(Hai).wasAbleTo(com.tradeteq.tasks.Login.with(userName, password));
        when(Hai).wasAbleTo(CreateCorporate.createCorporateWith(corporateInformation));
        then(Hai).should(seeThat(CorporateDetailsInformation.information(),
                displays("txtSummaryDescription", equalTo(corporateInformation.txtSummaryDescription))));
    }

    @Test
    public void VerifyDisplayingTheRequiredErrorMessage()
    {
        givenThat(Hai).wasAbleTo(com.tradeteq.tasks.Login.with(userName, password));
        when(Hai).wasAbleTo(      Click.on(DashBoardPage.menuOperation),
                Click.on(DashBoardPage.buttonCreateNewOperator),
                new  ClickOnTarget(CreateCorporateFormPage.txtIntCorporateID));
        then(Hai).should(seeThat(ErrorMessage.text(),
                is("This field is required")));
    }

    public  String getRandomNumberString(int range) {
        Random rnd = new Random();
        int number = rnd.nextInt(range);
        return String.valueOf(number);
    }
}
