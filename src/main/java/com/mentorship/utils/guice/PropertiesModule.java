package com.mentorship.utils.guice;

import com.google.inject.AbstractModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.google.inject.name.Names.bindProperties;

public class PropertiesModule extends AbstractModule {

    private static final Logger LOG = LoggerFactory.getLogger(PropertiesModule.class);
    private static final String CONFIG_PROPERTIES = "src/test/resources/config.properties";

    @Override
    protected void configure() {
        Properties properties = new Properties();
        try {
            properties.load(new BufferedInputStream(new FileInputStream(CONFIG_PROPERTIES)));
        } catch (IOException e) {
            LOG.error("Error occurred while processing properties in file {}", CONFIG_PROPERTIES, e);
            throw new IllegalStateException("Unable to load properties");
        }
        bindProperties(binder(), properties);
    }
}
