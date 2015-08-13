package com.goeuro.webmobile.tests;


import com.goeuro.webmobile.model.TrainProvider;
import com.goeuro.webmobile.steps.GoeuroSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchTest {

    @Managed
    WebDriver driver;

    @Steps
    GoeuroSteps goeuroSteps;

    @Before
    public void setup(){

    }

    @Test
    public void searchGoeuroTest() {
        goeuroSteps
                .open_home_page()
                .type_from("Berlin")
                .type_to("Hamburg")
                .click_search_button()
                .should_present_train_provider(TrainProvider.BD_BAHN);

    }
}
