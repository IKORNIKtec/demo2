package com.goeuro.webmobile.fixture;

import net.thucydides.core.fixtureservices.FixtureException;
import net.thucydides.core.fixtureservices.FixtureService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class FixtureBrowserMobile implements FixtureService {
    @Override
    public void setup() throws FixtureException {
    }

    @Override
    public void shutdown() throws FixtureException {
    }

    @Override
    public void addCapabilitiesTo(DesiredCapabilities desiredCapabilities) {
        String chromeDriver = FixtureBrowserMobile.class.getClassLoader().getResource(".").getFile()+"chromedriver.exe";

        File file = new File(chromeDriver);
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        Map<String, String> mobileEmulation = new HashMap<String, String>();
        mobileEmulation.put("deviceName", "Apple iPhone 6");

        Map<String, Object> chromeOptions = new HashMap<String, Object>();
        chromeOptions.put("mobileEmulation", mobileEmulation);
        desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        desiredCapabilities.setCapability("screen-resolution","375x667");
    }
}
