package com.mentorship.utils.properties;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class ConfigProperties {

    @Inject
    @Named("sample.value")
    private String sampleValue;

    public String getSampleValue() {
        if (null != System.getProperty("sample.value")) {
            return System.getProperty("sample.value");
        } else {
            return sampleValue;
        }
    }
}
