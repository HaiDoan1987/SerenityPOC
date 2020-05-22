package com.tradeteq.pageobject;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

public class DashBoardPage  extends PageObject {
    public static final Target menuOperation = Target.the("Operation Menu").locatedBy("//*[@id='operations']");

    public static final Target buttonCreateNewOperator = Target.the("Create New Operator").locatedBy("//button[contains(text(),' Create New Corporate ')]");

    public static final Target marketPlaceMenu = Target.the("Market Place Menu").locatedBy("//h4[contains(text(),'Marketplace')]");

    public DashBoardPage(WebDriver driver){
        super(driver);
    }
}

