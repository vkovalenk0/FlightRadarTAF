package com.mentorship;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.mentorship.utils.guice.DependenciesModule;
import com.mentorship.utils.guice.PropertiesModule;
import io.qameta.allure.selenide.AllureSelenide;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Guice;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Guice(modules = {DependenciesModule.class, PropertiesModule.class})
public class BaseTest {

    private static final Logger LOG = LoggerFactory.getLogger(BaseTest.class);
    private static final String SELENIDE_PROPERTIES = "src/test/resources/selenide.properties";

    @BeforeSuite
    public void setUpDriverConfig() {
        Properties properties = System.getProperties();
        try {
            properties.load(new BufferedInputStream(new FileInputStream(SELENIDE_PROPERTIES)));
        } catch (IOException e) {
            LOG.warn("Driver config property file {} is not loaded, default Selenide config will be used",
                    SELENIDE_PROPERTIES, e);
        }
        System.setProperties(properties);
    }

    @BeforeSuite
    public void setLog() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(false).savePageSource(false));
    }

    @AfterMethod(alwaysRun = true)
    public void shutDownBrowser() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
    }
}
