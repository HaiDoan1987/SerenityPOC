package com.tradeteq.pageobject;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

public class MarketplacePage extends PageObject {

    public static final Target tabMyDeals = Target.the("My deal tab").locatedBy("//a[contains(text(),' My deals')]");



    public MarketplacePage(WebDriver driver){
        super(driver);
    }
}

