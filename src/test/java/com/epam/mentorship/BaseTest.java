package com.epam.mentorship;

import com.epam.mentorship.utils.guice.DependenciesModule;
import com.epam.mentorship.utils.guice.PropertiesModule;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Guice;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Guice(modules = {DependenciesModule.class, PropertiesModule.class})
public class BaseTest {

    private static final String SELENIDE_PROPERTIES = "src/test/resources/selenide.properties";

    @BeforeSuite
    public void setUpDriverConfig() {
        Properties properties = System.getProperties();
        try {
            properties.load(new BufferedInputStream(new FileInputStream(SELENIDE_PROPERTIES)));
        } catch (IOException e) {
            // TODO LOG here
            e.printStackTrace();
            return;
        }
        System.setProperties(properties);
    }
}
