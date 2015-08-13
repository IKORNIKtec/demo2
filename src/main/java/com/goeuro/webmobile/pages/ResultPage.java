package com.goeuro.webmobile.pages;
import com.goeuro.webmobile.model.TrainProvider;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ResultPage extends PageObject {

    @FindBy(id = "searchoptions")
    WebElementFacade result;

    public boolean isResultDisplayed(){
        return result.isDisplayed();
    }

    public List<WebElement> getResultItems(TrainProvider value) {
        final String locator = String.format("[class='Page-results'] [style*='%s'][class='Card-logo']", value.getLogoUrl());
        return thenReturnElementList(By.cssSelector(locator));
    }
}
