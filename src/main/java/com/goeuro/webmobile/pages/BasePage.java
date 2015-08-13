package com.goeuro.webmobile.pages;

import com.goeuro.webmobile.config.Servers;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BasePage extends PageObject {
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void setDefaultBaseUrl(String defaultBaseUrl) {
        String baseUrl = System.getProperty("url", Servers.QA9.getUrl() );
        super.setDefaultBaseUrl(baseUrl);
    }

    public void waitForElementAndClick(By by){
        WebElementFacade elementFacade= null;
        for (int i=0;i<100;i++){
            try{
                getDriver().findElement(by).click();
                break;
            }catch (StaleElementReferenceException e){
                logger.info("#{} StaleElementReferenceException :\n" +
                        " Element located by {} will be searched again", i, by.toString());
            }
            waitABit(100);
        }

    }
}