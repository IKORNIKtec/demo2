package com.goeuro.webmobile.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends BasePage {

    // FROM
    @FindBy(css = "[data-pointer='from_filter']")
    WebElementFacade from;
    @FindBy(id = "ajax_from_filter")
    WebElementFacade fromAjax;
    @FindBy(css = ".from_output li:nth-of-type(1)")
    WebElementFacade fromSuggestResult;

    // TO
    @FindBy(css = "[data-pointer='to_filter']")
    WebElementFacade to;
    @FindBy(id = "ajax_to_filter")
    WebElementFacade toAjax;
    @FindBy(css = ".to_output li:nth-of-type(1)")
    WebElementFacade toSuggestResult;

    @FindBy(className = "search-btn")
    WebElementFacade searchButton;

    public void typeFrom(String value) {
        from.click();
        fromAjax.sendKeys(value);
        waitForElementAndClick(By.cssSelector(".from_output li:nth-of-type(1)"));
       // withTimeoutOf(30, TimeUnit.SECONDS).waitFor(fromSuggestResult).then().click();
    }

    public void typeTo(String value){
        to.click();
        toAjax.sendKeys(value);
        waitForElementAndClick(By.cssSelector(".to_output li:nth-of-type(1)"));
        //withTimeoutOf(30, TimeUnit.SECONDS).waitFor(toSuggestResult).then().click();
    }

    public void clickSearchButton(){
        searchButton.waitUntilClickable().click();
    }

}