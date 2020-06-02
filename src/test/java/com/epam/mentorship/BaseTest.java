package com.epam.mentorship;

import com.epam.mentorship.utils.guice.DependenciesModule;
import com.epam.mentorship.utils.guice.PropertiesModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
}
