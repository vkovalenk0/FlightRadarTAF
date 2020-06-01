package com.epam.mentorship.utils.guice;

import com.google.inject.AbstractModule;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.google.inject.name.Names.bindProperties;

public class PropertiesModule extends AbstractModule {

    private static final String CONFIG_PROPERTIES = "src/test/resources/config.properties";

    @Override
    protected void configure() {
        Properties properties = new Properties();
        try {
            properties.load(new BufferedInputStream(new FileInputStream(CONFIG_PROPERTIES)));
        } catch (IOException e) {
            // TODO LOG here
            e.printStackTrace();
            return;
        }
        bindProperties(binder(), properties);
    }
}
