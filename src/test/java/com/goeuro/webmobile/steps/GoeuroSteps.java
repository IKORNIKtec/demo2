package com.goeuro.webmobile.steps;

import com.goeuro.webmobile.pages.HomePage;
import com.goeuro.webmobile.pages.ResultPage;
import com.goeuro.webmobile.model.TrainProvider;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class GoeuroSteps extends ScenarioSteps {

    HomePage homePage;
    ResultPage resultPage;

    @Step
    public GoeuroSteps open_home_page() {
        homePage.open();
        return this;
    }

    @Step
    public GoeuroSteps type_from(String value) {
        homePage.typeFrom(value);
        return this;
    }

    @Step
    public GoeuroSteps type_to(String value) {
        homePage.typeTo(value);
        return this;
    }

    @Step
    public GoeuroSteps click_search_button() {
        homePage.clickSearchButton();
        return this;
    }

    @Step
    public void should_present_search_result() {
        assertThat(resultPage.isResultDisplayed(), equalTo(true));
    }

    @Step
    public GoeuroSteps should_present_train_provider(TrainProvider value) {
        assertThat(resultPage.getResultItems(value).size(), not(equalTo(0)));
        return this;
    }
}
